package com.affair.config;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhou
 * @date 2020/6/30 3:15
 */
@Configuration
public class MultipartSupportConfig {
  @Bean
  public Encoder feignFormEncoder() {
    return new SpringFormEncoder();
  }
}
