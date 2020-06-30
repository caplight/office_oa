package com.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * @author CAPLIGHT
 * @create 2020-06-17 2:47 PM
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GateWayBoot {
    public static void main(String[] args) {
        SpringApplication.run(GateWayBoot.class,args);
    }
}
