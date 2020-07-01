package com.affair.controller;

import com.affair.handler.SystemHandler;
import com.affair.service.UpLoadFileService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.springcloud.commonapi.utils.ResultUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @author zhou
 * @date 2020/6/30 3:01
 */
@RestController
@Slf4j
@Api(value = "UploadFileController文件上传接口", tags = {"UploadFileController文件上传接口"})
public class UploadFileController {
  @Resource
  private UpLoadFileService upLoadFileService;

  @PostMapping("/upload")
  @SentinelResource(value = "upload", fallback = "handlerFallback",blockHandlerClass = SystemHandler.class,blockHandler = "blockHandler")
  public String upload(MultipartFile[] file){
    return upLoadFileService.uploads(file);
  }

  public String handlerFallback(Throw e){
    return ResultUtil.result("error","服务内部请求出错了>_<,请尽快联系管理员处理");
  }
}
