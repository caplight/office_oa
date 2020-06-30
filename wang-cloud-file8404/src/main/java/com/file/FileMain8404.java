package com.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhou
 * @date 2020/6/30 1:50
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class FileMain8404 {
  public static void main(String[] args) {
    SpringApplication.run(FileMain8404.class,args);
  }
}
