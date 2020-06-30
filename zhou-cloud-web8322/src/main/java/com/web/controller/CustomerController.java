package com.web.controller;

import com.springcloud.commonapi.entities.Custinfo;
import com.web.service.CustomerService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zhou
 * @date 2020/6/28 17:51
 */
@RestController
@Api(value = "CustomerRestApi销售信息相关接口", tags = {"CustomerRestApi销售信息相关接口"})
public class CustomerController {
  @Resource
  private CustomerService customerService;
  @Resource
  private RestTemplate restTemplate;


  String URL = "http://zhou-cloud-customermanage";

  //查询所有客户信息
  @GetMapping("/queryAll")
  public String queryAll(){
//    return restTemplate.getForObject(URL+"/queryAll",String.class);
    return  customerService.queryAll();
  }

  //查询用户客户
  @GetMapping("/queryCustByAsc")
  public String queryCustByAsc(String ascription){
    return customerService.queryCustByAsc(ascription);
  }

  //添加客户信息
  @PostMapping("/insert")
  public String insert(Custinfo custinfo){
    return customerService.insert(custinfo);
  }

  //更新客户信息
  @PutMapping("/update")
  public String update(Custinfo custinfo){
    return customerService.update(custinfo);
  }

  //删除客户
  @DeleteMapping("/delete")
  public String delete(Integer id){
    return customerService.delete(id);
  }

  //根据entity查询
  @GetMapping("/queryCust")
  public String queryCust(Custinfo custinfo){
    return customerService.queryCust(custinfo);
  }

  @GetMapping("/queryAllByLimit")
  public String queryAllByLimit(
   @RequestParam(required = false,defaultValue = "1",value = "page") Integer page,
   @RequestParam(required = false,defaultValue = "12",value = "limit") Integer limit
  ){
    return customerService.queryAllByLimit(page, limit);
  }
}
