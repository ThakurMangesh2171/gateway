package com.springGateWay.GateWay.Filters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.*;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RefreshScope
@Component
public class AuthenticationFilter implements GatewayFilter  {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("IN AuthenticationFilter :: filter");
        ServerHttpRequest request = exchange.getRequest();

        if (!request.getHeaders().containsKey("x-api-key")) {
            return this.onError(exchange, "api-key missing", HttpStatus.FORBIDDEN);
        }
        // need to set the URL
        String url = "http://localhost:8087/auth";
        System.out.println("url"+url);

        try {
            HttpHeaders headers = new HttpHeaders();
            HttpEntity<?> entity = new HttpEntity<>(headers);

            ResponseEntity<String> responseEntity = new RestTemplate().exchange(url, HttpMethod.GET, entity, String.class);
            if (responseEntity.getStatusCode() != HttpStatus.OK) {
                // Handle non-OK status codes, if needed
                System.out.println("NOt OK");
                return this.onError(exchange, "authorization failed", responseEntity.getStatusCode());
            }
        } catch (HttpClientErrorException e) {
            // Handle HttpClientErrorException (e.g., 4xx errors)
            System.err.println("HTTP Error: " + e.getRawStatusCode());
            System.err.println("Error Response: " + e.getResponseBodyAsString());
            return this.onError(exchange, e.getResponseBodyAsString(), e.getStatusCode());
        } catch (ResourceAccessException e) {
            // Handle ResourceAccessException (e.g., network issues)
            System.err.println("Network Error: " + e.getMessage());
            return this.onError(exchange, e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return chain.filter(exchange);
    }

//    private Mono<Void> onError(ServerWebExchange exchange, String err, HttpStatus httpStatus) {
//        ServerHttpResponse response = exchange.getResponse();
//        response.setStatusCode(httpStatus);
//        return response.setComplete();
//    }

    private Mono<Void> onError(ServerWebExchange exchange, String err, HttpStatus httpStatus) {
        ServerHttpResponse response = exchange.getResponse();
        response.setStatusCode(httpStatus);
        response.getHeaders().add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE); // Set content type to JSON

        // Create an error JSON response
        Map<String, Object> errorResponse = new HashMap<>();
//        errorResponse.put("error", err);

        try {
            // Parse the original error message JSON
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, Object> originalError = objectMapper.readValue(err, new TypeReference<Map<String, Object>>() {});

            // Include additional details from the original error message in the response
            errorResponse.put("result",originalError.get("result"));
            errorResponse.put("statusCode", originalError.get("statusCode"));
            errorResponse.put("statusCodeDescription", originalError.get("statusCodeDescription"));
            errorResponse.put("message", originalError.get("message"));
            errorResponse.put("response", originalError.get("response"));
        } catch (IOException e) {
            // If there is an error parsing the original error JSON, provide a generic error message
            errorResponse.put("statusCode", httpStatus.value());
            errorResponse.put("statusCodeDescription", httpStatus.getReasonPhrase());
        }

        // Convert the errorResponse map to JSON
        byte[] errorResponseBytes;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            errorResponseBytes = objectMapper.writeValueAsBytes(errorResponse);
        } catch (JsonProcessingException e) {
            errorResponseBytes = new byte[0]; // Empty response in case of JSON processing error
        }

        DataBuffer buffer = response.bufferFactory().wrap(errorResponseBytes);
        return response.writeWith(Mono.just(buffer));
    }

}