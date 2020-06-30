package com.affair.controller;


import com.affair.handler.SystemHandler;
import com.affair.service.AffairService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.springcloud.commonapi.entities.Affair;
import com.springcloud.commonapi.utils.ResultUtil;
import io.swagger.annotations.Api;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Affair)表控制层
 *
 * @author makejava
 * @since 2020-06-30 01:35:24
 */
@RestController
@RequestMapping("/affair")
@Api(value = "AffairController事务接口", tags = {"AffairController事务接口"})
public class AffairController {
    /**
     * 服务对象
     */
    @Resource
    private AffairService affairService;

    //更具affair条件查询
    @SentinelResource(value = "queryByAffairs", fallback = "handlerFallback",blockHandlerClass = SystemHandler.class,blockHandler = "blockHandler")
    @GetMapping("/queryByAffairs")
    public String queryByAffairs(Affair affair){
        List<Affair> affairs = affairService.queryAll(affair);
        return ResultUtil.result("success",affairs);
    }

    //查询所有事务
    @GetMapping("/queryAll")
    @SentinelResource(value = "queryAll", fallback = "handlerFallback",blockHandlerClass = SystemHandler.class,blockHandler = "blockHandler")
    public String queryAll(){
        List<Affair> affairs = affairService.queryAll(null);
        return ResultUtil.result("success",affairs);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @GetMapping("/queryById")
    @SentinelResource(value = "queryById", fallback = "handlerFallback",blockHandlerClass = SystemHandler.class,blockHandler = "blockHandler")
    public String queryById(Integer id) {
        Affair affair = affairService.queryById(id);
        return ResultUtil.result("success",affair);
    }

    //分页查询
    @GetMapping("/queryAllByLimit")
    @SentinelResource(value = "queryAllByLimit", fallback = "handlerFallback",blockHandlerClass = SystemHandler.class,blockHandler = "blockHandler")
    public String queryAllByLimit(int page, int limit) {
        int offset = (page-1)*limit;
        List<Affair> affairs = affairService.queryAllByLimit(offset, limit);
        return ResultUtil.result("success",affairs);
    }

    //插入数据
    @PostMapping("/insert")
    @SentinelResource(value = "insert", fallback = "handlerFallback",blockHandlerClass = SystemHandler.class,blockHandler = "blockHandler")
    public String insert(Affair affair) {
        Affair insert = affairService.insert(affair);
        return ResultUtil.result("success",insert);
    }

   //修改数据，根据Id
    @PutMapping("/update")
    @SentinelResource(value = "update", fallback = "handlerFallback",blockHandlerClass = SystemHandler.class,blockHandler = "blockHandler")
    public String update(Affair affair) {
        Affair update = affairService.update(affair);
        if (update!=null){
            return ResultUtil.result("success",update);
        }
        return ResultUtil.result("error","查询不到需要更改的数据");
    }

    //删除
    @DeleteMapping("/deleteById")
    @SentinelResource(value = "deleteById", fallback = "handlerFallback",blockHandlerClass = SystemHandler.class,blockHandler = "blockHandler")
    public String deleteById(Integer id) {
        boolean b = affairService.deleteById(id);
        if (b) {
            return ResultUtil.result("success",id);
        }
        return ResultUtil.result("error",null);
    }


    //异常处理
    public String handlerFallback(Throw e){
        return ResultUtil.result("error","服务内部请求出错了>_<,请尽快联系管理员处理");
    }

}