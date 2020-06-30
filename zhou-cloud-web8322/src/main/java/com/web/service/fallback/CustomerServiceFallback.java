package com.web.service.fallback;

import com.springcloud.commonapi.entities.Custinfo;
import com.springcloud.commonapi.utils.ResultUtil;
import com.web.service.CustomerService;
import org.springframework.stereotype.Component;

/**
 * @author zhou
 * @date 2020/6/28 17:37
 */
@Component
public class CustomerServiceFallback implements CustomerService {
  @Override
  public String queryAll() {
    return ResultUtil.result("error","CustomerService-queryAll请求异常");
  }

  @Override
  public String queryCustByAsc(String ascription) {
    return ResultUtil.result("error","CustomerService-queryCustByAsc请求异常");
  }

  @Override
  public String insert(Custinfo custinfo) {
    return ResultUtil.result("error","CustomerService-insert请求异常");
  }

  @Override
  public String update(Custinfo custinfo) {
    return ResultUtil.result("error","CustomerService-update请求异常");
  }

  @Override
  public String delete(Integer id) {
    return ResultUtil.result("error","CustomerService-delete请求异常");
  }

  @Override
  public String queryCust(Custinfo custinfo) {
    return ResultUtil.result("error","CustomerService-queryCust请求异常");
  }

  @Override
  public String queryAllByLimit(Integer page, Integer limit) {
    return ResultUtil.result("error","CustomerService-queryAllByLimit请求异常");
  }
}
