package com.stock.controller;


import com.springcloud.commonapi.entities.Commsg;
import com.springcloud.commonapi.utils.ResultUtil;
import com.stock.service.CommsgService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Commsg)表控制层
 *
 * @author makejava
 * @since 2020-07-01 06:59:42
 */
@RestController
@RequestMapping("/commsg")
@Api(value = "CommsgController相关接口", tags = {"CommsgController相关接口"})
public class CommsgController {
    /**
     * 服务对象
     */
    @Resource
    private CommsgService commsgService;

   //条件查询，如果参数为null查询所有
    @GetMapping("/queryAll")
    public String queryAll(Commsg commsg){
        List<Commsg> commsgs = commsgService.queryAll(commsg);
        return ResultUtil.result("success",commsgs);
    }

    //分页查询
    @GetMapping("queryCommsgByLimit")
    public String queryCommsgByLimit(int page,int limit){
        int offset =(page-1)*limit;
        List<Commsg> commsgs = commsgService.queryAllByLimit(offset, limit);
        return ResultUtil.result("success",commsgs);
    }

    //通过id查询
    @GetMapping("/queryById")
    public String queryById(Integer cno){
        Commsg commsg = commsgService.queryById(cno);
        return ResultUtil.result("success",commsg);
    }


    /**
     * 新增数据
    */
    @PostMapping("/insert")
    public String insert(Commsg commsg){
        Commsg insert = commsgService.insert(commsg);
        return ResultUtil.result("success",insert);
    }

    /**
     * 修改数据
     */
    @PutMapping("/update")
    public String update(Commsg commsg){
        Commsg update = commsgService.update(commsg);
        return ResultUtil.result("success",update);
    }

    /**
     * 通过主键删除数据
     */
    @DeleteMapping("/deleteById")
    public String deleteById(Integer cno){
        boolean b = commsgService.deleteById(cno);
        if (b) {
            return ResultUtil.result("success",cno);
        }
        return ResultUtil.result("error","未找到相关id");
    }

}