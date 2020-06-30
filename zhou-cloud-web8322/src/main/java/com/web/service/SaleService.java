//package com.web.service;
//
//import com.springcloud.commonapi.entities.Sale;
//import com.web.service.fallback.SaleServiceFallback;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.*;
//
///**
// * @author zhou
// * @date 2020/6/28 17:27
// */
//@Component
//@FeignClient(value = "zhou-cloud-salemanager",fallback = SaleServiceFallback.class)
//public interface SaleService {
//  //查询所有顾客销售情况
//  @GetMapping("/queryAllSale")
//  public String queryAllSale();
//
//  //根据顾客姓名查询销售记录
//  @GetMapping("/querySaleByCname")
//  public String querySaleByCname(String cname);
//
//  //添加销售情况
//  @PostMapping("/insert")
//  public String insert(Sale sale);
//
//  //根据id删除销售信息
//  @DeleteMapping("/deleteSaleById")
//  public String deleteSaleById(Integer id);
//
//  //修改销售内容
//  @PutMapping("/updateSaleBySale")
//  public String updateSaleById(Sale sale);
//
//  //分页查询
//  @GetMapping("/querySaleByLimit")
//  public String querySaleByLimit(
//   @RequestParam(required = false,defaultValue = "1",value = "page") Integer page,
//   @RequestParam(required = false,defaultValue = "12",value = "limit") Integer limit);
//}
