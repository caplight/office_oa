package com.affair.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.springcloud.commonapi.utils.ResultUtil;

/**
 * @author zhou
 * @date 2020/6/30 21:57
 */
//自定义限流处理逻辑
public class SystemHandler {

  public static String blockHandler(BlockException b){
    return ResultUtil.result("error","服务器访问数量太多，扛不住了>_<，开始限制访问");
  }
}
