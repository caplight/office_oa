package com.test.service;

import com.springcloud.commonapi.entities.Custinfo;
import com.test.service.fallback.CustomerServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhou
 * @date 2020/6/28 17:27
 */
@Component
@FeignClient(value = "zhou-cloud-customermanage",fallback = CustomerServiceFallback.class)
public interface CustomerService {

  //查询所有客户信息
  @GetMapping("/queryAll")
  public String queryAll();

  //查询用户客户
  @GetMapping("/queryCustByAsc")
  public String queryCustByAsc(@RequestParam String ascription);

  //添加客户信息
  @PostMapping("/insert")
  public String insert(@SpringQueryMap Custinfo custinfo);

  //更新客户信息
  @PutMapping("/update")
  public String update(@SpringQueryMap Custinfo custinfo);

  //删除客户
  @DeleteMapping("/delete")
  public String delete(@RequestParam Integer id);

  //根据entity查询
  @RequestMapping(value = "/queryCust",method = RequestMethod.GET)
  public String queryCust(@SpringQueryMap Custinfo custinfo);

  @GetMapping("/queryAllByLimit")
  public String queryAllByLimit(
    @RequestParam(required = false, defaultValue = "1", value = "page") Integer page,
    @RequestParam(required = false, defaultValue = "12", value = "limit") Integer limit
  );
}
