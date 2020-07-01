package com.stock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhou
 * @date 2020/7/1 7:00
 */
@EnableCaching
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.salemanage.mapper")
@ComponentScan(basePackages = {
 "com.springcloud.commonapi.utils",
 "com.stock.service",
 "com.stock.controller",
 "com.stock.dao",
 "com.stock.config"})
public class StockMain8360 {
  public static void main(String[] args) {
    SpringApplication.run(StockMain8360.class,args);
  }
}
