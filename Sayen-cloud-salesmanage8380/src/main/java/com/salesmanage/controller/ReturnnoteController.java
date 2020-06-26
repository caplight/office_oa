package com.salesmanage.controller;

import com.salesmanage.entity.Returnnote;
import com.salesmanage.service.ReturnnoteService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Returnnote)表控制层
 *
 * @author makejava
 * @since 2020-06-26 11:49:33
 */
@RestController
@RequestMapping("returnnote")
public class ReturnnoteController {
    /**
     * 服务对象
     */
    @Resource
    private ReturnnoteService returnnoteService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public Returnnote selectOne(@PathVariable("id") String id) {
        return this.returnnoteService.queryById(id);
    }



}