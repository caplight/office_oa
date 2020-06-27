package com.salemanage.restapi;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.salemanage.service.SaleService;
import com.springcloud.commonapi.entities.Sale;
import com.springcloud.commonapi.utils.ResultUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhou
 * @date 2020/6/28 0:18
 */
@RestController
@Slf4j
@RequestMapping("/sale")
@Api(value = "SaleRestApi销售信息相关接口", tags = {"SaleRestApi销售信息相关接口"})
public class SaleRestApi {
  //服务装配
  @Autowired
  private SaleService saleService;

  //查询所有顾客销售情况
  @GetMapping("/queryAllSale")
  public String queryAllSale(){
    List<Sale> list = saleService.list();
    return ResultUtil.result("success",list);
  }

  //根据顾客姓名查询销售记录
  @GetMapping("querySaleByCname")
  public String querySaleByCname(String cname){
    Map<String,Object> map = new HashMap<>();
    map.put("cname",cname);
    Collection<Sale> sales = saleService.listByMap(map);
    return ResultUtil.result("success",sales);
  }

  //添加销售情况
  @PostMapping("/insert")
  public String insert(Sale sale){
    boolean save = saleService.save(sale);
    if (save){
      return ResultUtil.result("success",sale);
    }
    return ResultUtil.result("error",null);
  }

  //根据id删除销售信息
  @DeleteMapping("/deleteSaleById")
  public String deleteSaleById(Integer id){
    boolean b = saleService.removeById(id);
    if (b){
      return ResultUtil.result("success",id);
    }
    return ResultUtil.result("error",null);
  }

  //修改销售内容
  @PutMapping("/updateSaleBySale")
  public String updateSaleById(Sale sale){
    QueryWrapper<Sale> queryWrapper =new QueryWrapper<>();
    queryWrapper.eq("id",sale.getId());
    boolean update = saleService.update(sale, queryWrapper);
    if (update){
      return ResultUtil.result("success",sale);
    }
    return ResultUtil.result("error",null);
  }
}
