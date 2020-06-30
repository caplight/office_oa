package com.salesmanage.controller;

import com.salesmanage.entity.Returnnote;
import com.salesmanage.entity.Salesnote;
import com.salesmanage.service.ReturnnoteService;
import com.salesmanage.service.SalesnoteService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Returnnote)表控制层
 *
 * @author Sayen
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
    @GetMapping("/{id}")
    public Returnnote selectOne(@PathVariable("id") String id) {
        return this.returnnoteService.queryById(id);
    }

    /**
     *查询表内所有数据
     */
    @GetMapping("/list")
    public List<Returnnote> getQueryAllByLimit() {
        return this.returnnoteService.queryAllByLimit(0,100);
    }
    /**
     * 根据主键删除单条数据
     */

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") String id) {
        return this.returnnoteService.deleteById(id);
    }

    /**
     *增加数据
     */
    @PutMapping("/{id}")
    public Returnnote put(@PathVariable("id") String id, @RequestBody Returnnote returnnote){
        returnnote.setReturnId(id);
        return this.returnnoteService.update(returnnote);
    }

}