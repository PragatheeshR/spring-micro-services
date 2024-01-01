package com.microservices.limitsservice.controller;

import com.microservices.limitsservice.configuration.LimitsConfig;
import com.microservices.limitsservice.service.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    LimitsConfig limitsConfig;

    @GetMapping("/limits")
    public Limits home(){

        return new Limits(limitsConfig.getMin(), limitsConfig.getMax());
    }
}
