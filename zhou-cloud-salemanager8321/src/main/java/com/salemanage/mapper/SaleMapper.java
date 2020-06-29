package com.salemanage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springcloud.commonapi.entities.Sale;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhou
 * @date 2020/6/28 0:11
 */
@Mapper
public interface SaleMapper extends BaseMapper<Sale> {
  //分页查询
  List<Sale> queryAllByLimit(@Param("offset") Integer offset, @Param("limit") Integer limit);

}
