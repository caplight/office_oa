package com.web.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhou
 * @date 2020/6/29 8:28
 */
@Configuration
public class FeignConfig {
  @Bean
  Logger.Level feignLoggerLevel(){
    return Logger.Level.FULL;
  }
}
