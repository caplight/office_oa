package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhou
 * @date 2020/6/29 12:40
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan(basePackages = {
 "com.springcloud.commonapi.utils",
 "com.test.config",
 "com.test.controller",
 "com.test.service"
})
public class TestMain8323 {
  public static void main(String[] args) {
    SpringApplication.run(TestMain8323.class,args);
  }
}
