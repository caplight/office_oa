package com.salesmanage.controller;

import com.salesmanage.entity.Salesnote;
import com.salesmanage.service.SalesnoteService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Salesnote)表控制层
 *
 * @author Sayen
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
    @GetMapping("/{id}")
    public Salesnote selectOne(@PathVariable("id") String id) {
        return this.salesnoteService.queryById(id);
    }
    /**
    *查询表内所有数据
     */


    @GetMapping("/list")
    public List<Salesnote> getQueryAllByLimit() {
        return this.salesnoteService.queryAllByLimit(0,100);
    }

    /**
     * 根据主键删除单条数据
     */
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") String id) {
        return this.salesnoteService.deleteById(id);
    }

    /**
     * 添加一个新数据
     * @param salesnote
     * @return
     */
    @PostMapping
    public Salesnote insert(@RequestBody Salesnote salesnote){
        return this.salesnoteService.insert(salesnote);
    }


    /**
     * 根据ID修改一条数据
     * @param id
     * @param salesnote
     * @return
     */
    @PutMapping("/{id}")
    public Salesnote put(@PathVariable("id") String id, @RequestBody Salesnote salesnote){
        salesnote.setSalesid(id);
        return this.salesnoteService.update(salesnote);
    }





}