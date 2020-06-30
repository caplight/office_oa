package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhou
 * @date 2020/6/28 16:12
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@ComponentScan(basePackages = {
 "com.springcloud.commonapi.utils",
 "com.web.config",
 "com.web.controller",
 "com.web.service"
})
public class Main8322 {
  public static void main(String[] args) {
    SpringApplication.run(Main8322.class,args);
  }
}
