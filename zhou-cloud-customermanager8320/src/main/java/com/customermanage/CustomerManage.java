package com.customermanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhou
 * @date 2020/6/27 1:59
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
@MapperScan("com.customermanager.mapper")
@ComponentScan(basePackages = {
 "com.springcloud.commonapi.utils",
 "com.springcloud.commonapi.config",
 "com.customermanage.service",
 "com.customermanage.restapi",
 "com.customermanage.mapper",
 "com.customermanage.config"})
public class CustomerManage {
  public static void main(String[] args) {
    SpringApplication.run(CustomerManage.class,args);
  }
}
