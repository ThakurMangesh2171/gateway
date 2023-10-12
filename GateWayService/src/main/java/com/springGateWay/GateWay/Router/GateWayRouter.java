package com.springGateWay.GateWay.Router;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayRouter {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("backend1", r -> r
                        .path("/backend1/**")
                        .uri("http://localhost:8086/")
                )
                .route("backend2", r -> r
                        .path("/backend2/**")
                        .uri("http://localhost:8087/")
                )
                .build();
    }
}
