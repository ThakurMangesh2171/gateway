package com.springGateWay.GateWay.Router;

import com.springGateWay.GateWay.Filters.AuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayRouter {

    // uncomment for Route

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("backend1", r -> r
//                        .path("/backend1/**")
//                        .uri("http://localhost:8086/")
//                )
//                .route("backend2", r -> r
//                        .path("/backend2/**")
//                        .uri("http://localhost:8087/")
//                )
//                .build();
//    }



    // just testing

    @Autowired
    AuthenticationFilter authenticationFilter;

    @Bean
    public RouteLocator apiRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("backend1", p -> p
                        .path("/backend1/**")
                        .filters(f -> f
                                .filter(authenticationFilter)
                                .rewritePath("http://localhost:8086/backend1/(?<segment>.*)", "/${segment}"))
                        .uri("http://localhost:8086/"))
                .route("backend2", p -> p
                        .path("/backend2/**")
                        .filters(f -> f
                                .rewritePath("http://localhost:8087/backend2/(?<segment>.*)", "/${segment}"))
                        .uri("http://localhost:8087/"))
                .build();
    }
}
