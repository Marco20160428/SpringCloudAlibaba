package com.example.nacossentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosSentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSentinelApplication.class, args);
    }

}
