package com.example.nacosprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @Value("${user.username}")
    private String username;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return string;
    }
}
