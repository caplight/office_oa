package com.test.controller;//package com.web.controller;

import com.springcloud.commonapi.entities.Sale;
import com.test.service.SaleService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zhou
 * @date 2020/6/28 17:42
 */
@RestController
@Slf4j
@RequestMapping("/sale")
@Api(value = "SaleRestApi销售信息相关接口", tags = {"SaleRestApi销售信息相关接口"})
public class SaleController {
  @Resource
  private SaleService saleService;

  //查询所有顾客销售情况
  @GetMapping("/queryAllSale")
  public String queryAllSale(){
    return saleService.queryAllSale();
  }

  //根据顾客姓名查询销售记录
  @GetMapping("/querySaleByCname")
  public String querySaleByCname(String cname){
    return saleService.querySaleByCname(cname);
  }

  //添加销售情况
  @PostMapping("/insert")
  public String insert(Sale sale){
   return saleService.insert(sale);
  }

  //根据id删除销售信息
  @DeleteMapping("/deleteSaleById")
  public String deleteSaleById(Integer id){
    return saleService.deleteSaleById(id);
  }

  //修改销售内容
  @PutMapping("/updateSaleBySale")
  public String updateSaleById(Sale sale){
    return saleService.updateSaleById(sale);
  }

  //分页查询
  @GetMapping("/querySaleByLimit")
  public String querySaleByLimit(
   @RequestParam(required = false,defaultValue = "1",value = "page") Integer page,
   @RequestParam(required = false,defaultValue = "12",value = "limit") Integer limit){
    return saleService.querySaleByLimit(page, limit);
  }
}
