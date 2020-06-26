package com.systemmanage.common.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CAPLIGHT
 * @create 2020-06-26 4:06 PM
 */
public class IndexControllerHandler {
    public static Map<String,Object> infoBlockHandler(BlockException blockException){
        Map<String,Object> result = new HashMap<>();
        result.put("mes","获取次数过多");
        result.put("advice","请稍后再试");
        result.put("exception",blockException.toString());
        return result;
    }
    public static Map<String,Object> test(BlockException blockException){
        Map<String,Object> result = new HashMap<>();
        result.put("mes","服务器正忙！");
        result.put("advice","请稍后再试");
        result.put("exception",blockException.toString());
        return result;
    }
}
