package com.salesmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Salesmanage {
    public static void main(String[] args) {
        SpringApplication.run(Salesmanage.class,args);
    }
}

