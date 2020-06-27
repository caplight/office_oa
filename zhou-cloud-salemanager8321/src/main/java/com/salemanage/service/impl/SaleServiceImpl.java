package com.salemanage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.salemanage.mapper.SaleMapper;
import com.salemanage.service.SaleService;
import com.springcloud.commonapi.entities.Sale;
import org.springframework.stereotype.Service;

/**
 * @author zhou
 * @date 2020/6/28 0:14
 */
@Service
public class SaleServiceImpl extends ServiceImpl<SaleMapper, Sale> implements SaleService {
}
