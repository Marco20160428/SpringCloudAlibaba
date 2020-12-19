package com.example.nacossleuthzipkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SleuthZipkinController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/test/{str}")
    public String test(@PathVariable String str){
        return restTemplate.getForObject("http://nacos-provider/echo/"+str, String.class);
    }
}
