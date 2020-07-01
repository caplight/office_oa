package com.systemmanage.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.systemmanage.common.handler.IndexControllerHandler;
import com.systemmanage.common.util.ResultUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 初始页面
 * @Author CAPLIGHT
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @Value("${server.port}")
    private int port;

    /**
     * 首页
     * @Author CAPLIGHT
     */
    @RequestMapping(value = "/info",method = RequestMethod.GET)
    @SentinelResource(value = "info",blockHandlerClass = IndexControllerHandler.class,blockHandler = "infoBlockHandler")
    public Map<String,Object> userLogin() {
        // 组装参数
        Map<String, Object> result = new HashMap<>();
        result.put("title", "用作于压力测试以及负载均衡测试");
        result.put("Port:", port);
        return ResultUtil.resultSuccess(result);
    }

    @GetMapping("/test")
    @SentinelResource(value = "test",fallback = "testFallback",defaultFallback = "testFallback")
    public String test() {
        int age = 10 / 0;
        return "----testE 测试异常数";
    }

    public String testFallback(){
        return "服务熔断，port:"+port;
    }
}
