package com.customermanage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.springcloud.commonapi.entities.Custinfo;

import java.util.List;

/**
 * @author zhou
 * @date 2020/6/27 2:07
 */
public interface CustInfoService extends IService<Custinfo> {
  //根据entity查询
  List<Custinfo> queryCust(Custinfo custinfo);

  //根据entity查询，允许为null，null查询所有
  List<Custinfo> queryAllCustInfo();

  //根据负责人查询客户
  List<Custinfo> queryCustByAsc(String ascription);

  //根据客户id删除
  void deleteById(Integer id);

  //根据客户id修改
  Custinfo update(Custinfo custinfo);

  //添加客户信息
  Custinfo insert(Custinfo custinfo);

  //分页查询
  List<Custinfo> queryAllByLimit(Integer offset,Integer limit);

}
