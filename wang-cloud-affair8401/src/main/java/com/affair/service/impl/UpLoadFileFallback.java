package com.affair.service.impl;

import com.affair.service.UpLoadFileService;
import com.springcloud.commonapi.utils.ResultUtil;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author zhou
 * @date 2020/6/30 2:51
 */
@ComponentScan
public class UpLoadFileFallback implements UpLoadFileService {
  @Override
  public String uploads(MultipartFile[] file) {
    return ResultUtil.result("error","文件上传Fallback");
  }
}
