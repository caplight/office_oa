package com.configcentre.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class configcontroller {

    @Value("${config.info}")
    private String configInfo;
    //版本查询，@RefreshScope自动更新测试
    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
