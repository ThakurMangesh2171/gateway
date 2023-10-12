package com.springGateWay.GateWay.LoadBalencer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoadBalancer {

    private final RestTemplate restTemplate;

    @Autowired
    public LoadBalancer(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String callAnotherService() {
        // Use the logical service name defined in your service discovery tool
        String serviceUrl = "http://localhost:8085/backend1/getMessage";
        return restTemplate.getForObject(serviceUrl, String.class);
    }
}
