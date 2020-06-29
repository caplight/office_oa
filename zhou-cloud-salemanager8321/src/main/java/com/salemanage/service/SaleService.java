package com.salemanage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springcloud.commonapi.entities.Sale;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhou
 * @date 2020/6/28 0:14
 */
public interface SaleService extends IService<Sale> {
  //分页查询
  List<Sale> queryAllByLimit(@Param("offset") Integer offset, @Param("limit") Integer limit);

}
