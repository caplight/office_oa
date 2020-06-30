package com.affair;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhou
 * @date 2020/6/29 16:46
 */
@EnableSwagger2
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.affair.dao")
@ComponentScan(basePackages = {
 "com.springcloud.commonapi.entities",
 "com.affair.controller",
 "com.affair.config",
 "com.affair.dao",
 "com.affair.service"
})
public class AffairMain8401 {
  public static void main(String[] args) {
    SpringApplication.run(AffairMain8401.class,args);
  }
}
