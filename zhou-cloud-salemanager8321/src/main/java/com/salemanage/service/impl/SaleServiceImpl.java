package com.salemanage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.salemanage.mapper.SaleMapper;
import com.salemanage.service.SaleService;
import com.springcloud.commonapi.entities.Sale;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhou
 * @date 2020/6/28 0:14
 */
@Service
public class SaleServiceImpl extends ServiceImpl<SaleMapper, Sale> implements SaleService {
  @Resource
   private SaleMapper saleMapper;

  @Override
  public List<Sale> queryAllByLimit(Integer offset, Integer limit) {
    return saleMapper.queryAllByLimit(offset,limit);
  }
}
