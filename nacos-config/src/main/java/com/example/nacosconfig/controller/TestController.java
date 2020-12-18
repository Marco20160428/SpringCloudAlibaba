package com.example.nacosconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value("${user.name}")
    private String userName;

    @Value("${user.age}")
    private int age;

    //http://localhost:10001/readConfig
    @GetMapping("/readConfig")
    public String readConfig(){
        return "Hello "+ userName + " age is "+ age;
    }
}
