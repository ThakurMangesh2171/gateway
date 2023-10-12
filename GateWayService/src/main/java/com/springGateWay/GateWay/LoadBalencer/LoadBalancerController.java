package com.springGateWay.GateWay.LoadBalencer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoadBalancerController {


    @Autowired
    LoadBalancer loadBalancer;

    @GetMapping("/consume-service")
    public String consumeService() {
        return loadBalancer.callAnotherService();
    }
}