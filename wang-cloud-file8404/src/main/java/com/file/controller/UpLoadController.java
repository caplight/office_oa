package com.file.controller;


import com.springcloud.commonapi.utils.ResultUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

//文件上传
@RestController
@Slf4j
@RequestMapping("UpLoadController")
@Api(value = "UpLoadController", tags = {"UpLoadController"})
public class UpLoadController {
  //文件上传路径
  String uploadPath="D://uploadFiles/";

  @RequestMapping(value = "/uploads", method = RequestMethod.POST,consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
  public String uploads(HttpServletRequest request, @RequestPart(value = "file") MultipartFile[] file) {

    String filename = "";//文件名
    try {
      //上传目录地址
      String uploadDir = uploadPath;

      //如果目录不存在，自动创建文件夹
      File dir = new File(uploadDir);

      if (!dir.exists()) {
        dir.mkdir();
      }

      //遍历文件数组执行上传
      for (int i = 0; i < file.length; i++) {
        if (file[i] != null) {
          //调用上传方法
          filename = executeUpload(uploadDir, file[i]);
        }
      }
    } catch (Exception e) {
      //打印错误堆栈信息
      e.printStackTrace();
      //返回错误信息500内部错误
      return ResultUtil.result("error","500");
    }
    log.info(filename);
    //成功上传，返回上传的文件链接
    return ResultUtil.result("success","http://localhost:8404/static/file/"+filename);
  }

  private String executeUpload(String uploadDir, MultipartFile file) throws Exception {
    //文件后缀名
    String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
    //上传文件名
    String filename = UUID.randomUUID() + suffix;
    //服务器端保存的文件对象
    File serverFile = new File(uploadDir + filename);

    if(!serverFile.exists()) {
      //先得到文件的上级目录，并创建上级目录，在创建文件
      serverFile.getParentFile().mkdir();
      try {
        //创建文件
        serverFile.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    //将上传的文件写入到服务器端文件内
    file.transferTo(serverFile);

    return filename;
  }

}
