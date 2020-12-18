package com.example.nacosconsumer.controller;

import com.example.nacosconsumer.feignservice.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EchoService echoService;

    //RestTemplate  http://127.0.0.1:9001/echo-rest/ouyang
    @GetMapping(value = "/echo-rest/{str}")
    public String rest(@PathVariable String str) {
        return restTemplate.getForObject("http://nacos-provider/echo/" + str, String.class);
    }

    //FeignClient   http://127.0.0.1:9001/echo-feign/ouyang
    @GetMapping(value = "/echo-feign/{str}")
    public String feign(@PathVariable String str) {
        return echoService.echo(str);
    }

}
