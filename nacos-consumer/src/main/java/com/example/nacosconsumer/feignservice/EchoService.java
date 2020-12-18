package com.example.nacosconsumer.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "nacos-provider")
public interface EchoService {

    @GetMapping(value = "/echo/{str}")
    String echo(@PathVariable("str") String str);
}
