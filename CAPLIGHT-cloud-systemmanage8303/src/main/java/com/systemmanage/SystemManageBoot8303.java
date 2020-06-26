package com.systemmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.systemmanage.dao"})
public class SystemManageBoot8303 {
    public static void main(String[] args) {
        SpringApplication.run(SystemManageBoot8303.class,args);
    }
}
