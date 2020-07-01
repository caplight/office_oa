package com.affair.service;

import com.affair.config.MultipartSupportConfig;
import com.affair.service.impl.UpLoadFileFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;


/**
 * @author zhou
 * @date 2020/6/30 2:50
 */
@Component
@FeignClient(value = "wang-cloud-file8404",configuration = MultipartSupportConfig.class,fallback = UpLoadFileFallback.class )
public interface UpLoadFileService {

  @RequestMapping(value = "/UpLoadController/uploads", method = RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
  public String uploads(@RequestPart("file")  MultipartFile[] file);


}
