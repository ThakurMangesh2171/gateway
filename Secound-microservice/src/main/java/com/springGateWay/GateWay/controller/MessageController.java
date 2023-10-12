package com.springGateWay.GateWay.controller;

import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/backend2")
public class MessageController {

//    private static final Logger LOGGER = (Logger) LogManager.getLogger(MessageController.class);
    @GetMapping("/getMessage")
    public String getMessage(@RequestParam String id) {
//        LOGGER.info("IN Second Server :: getMessage"+id);
        System.out.println("In Second Server :: "+id);
        return "This is message of Second-microservice";
    }
}
