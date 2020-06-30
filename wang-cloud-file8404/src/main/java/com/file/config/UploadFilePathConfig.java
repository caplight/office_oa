package com.file.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @date 2020/6/19 14:08
 */
@Configuration
@Slf4j
public class UploadFilePathConfig implements WebMvcConfigurer {
  @Value("${file.staticAccessPath}")
  private String staticAccessPath;
  @Value("${file.uploadFolder}")
  private String uploadFolder;

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    log.info(staticAccessPath);
    log.info(uploadFolder);
    registry.addResourceHandler(staticAccessPath).addResourceLocations("file:" + uploadFolder);
  }

}
