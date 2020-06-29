package com.test.service.fallback;//package com.web.service.fallback;

import com.springcloud.commonapi.entities.Sale;
import com.springcloud.commonapi.utils.ResultUtil;
import com.test.service.SaleService;
import org.springframework.stereotype.Component;

/**
 * @author zhou
 * @date 2020/6/28 17:30
 */
@Component
public class SaleServiceFallback implements SaleService {
  @Override
  public String queryAllSale() {
    return ResultUtil.result("error","SaleService-queryAllSale请求异常");
  }

  @Override
  public String querySaleByCname(String cname) {
    return ResultUtil.result("error","SaleService-querySaleByCname请求异常");
  }

  @Override
  public String insert(Sale sale) {
    return ResultUtil.result("error","SaleService-qinsert请求异常");
  }

  @Override
  public String deleteSaleById(Integer id) {
    return ResultUtil.result("error","SaleService-deleteSaleById请求异常");
  }

  @Override
  public String updateSaleById(Sale sale) {
    return ResultUtil.result("error","SaleService-updateSaleById请求异常");
  }

  @Override
  public String querySaleByLimit(Integer page, Integer limit) {
    return ResultUtil.result("error","SaleService-querySaleByLimit请求异常");
  }
}
