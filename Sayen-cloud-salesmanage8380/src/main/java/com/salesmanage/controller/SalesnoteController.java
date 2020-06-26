package com.salesmanage.controller;

import com.salesmanage.entity.Salesnote;
import com.salesmanage.service.SalesnoteService;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Salesnote)表控制层
 *
 * @author makejava
 * @since 2020-06-26 11:49:14
 */
@RestController
@RequestMapping("salesnote")
public class SalesnoteController {
    /**
     * 服务对象
     */
    @Resource
    private SalesnoteService salesnoteService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne/{id}")
    public Salesnote selectOne(@PathVariable("id") String id) {
        return this.salesnoteService.queryById(id);
    }

}