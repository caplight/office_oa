package com.note;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhou
 * @date 2020/6/29 17:56
 */
//@EnableSwagger2
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.note.dao")
@ComponentScan(basePackages = {
 "com.springcloud.commonapi.entities",
"com.note.config",
"com.note.controller",
"com.note.dao",
"com.note.service"})
public class NoteMain8402 {
  public static void main(String[] args) {
    SpringApplication.run(NoteMain8402.class,args);
  }
}
