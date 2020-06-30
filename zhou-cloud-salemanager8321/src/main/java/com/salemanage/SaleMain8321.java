package com.salemanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhou
 * @date 2020/6/27 16:20
 */
@EnableCaching
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.salemanage.mapper")
@ComponentScan(basePackages = {
 "com.springcloud.commonapi.utils",
 "com.salemanage.service",
 "com.salemanage.restapi",
 "com.salemanage.mapper",
 "com.salemanage.config"})
public class SaleMain8321 {
  public static void main(String[] args) {
    SpringApplication.run(SaleMain8321.class,args);
  }
}
