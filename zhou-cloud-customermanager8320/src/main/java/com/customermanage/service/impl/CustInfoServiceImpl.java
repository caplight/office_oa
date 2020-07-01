package com.customermanage.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.customermanage.mapper.CustInfoMapper;
import com.customermanage.service.CustInfoService;
import com.springcloud.commonapi.entities.Custinfo;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhou
 * @date 2020/6/27 2:07
 */
@Service
@CacheConfig(cacheNames = "custinfo")//用于同一配置给其它注解配置名称
public class CustInfoServiceImpl extends ServiceImpl<CustInfoMapper, Custinfo> implements CustInfoService {

  @Resource
  private CustInfoMapper custInfoMapper;


  @Override
  public List<Custinfo> queryCust(Custinfo custinfo) {
    return custInfoMapper.queryAll(custinfo);
  }

  @Override
  @Cacheable(key = "'all'")
  public List<Custinfo> queryAllCustInfo() {
    return custInfoMapper.queryAll(null);
  }

  @Override
  @Cacheable(key = "#p0")
  public List<Custinfo> queryCustByAsc(String ascription) {
    Map<String,Object> map = new HashMap<>();
    map.put("ascription",ascription);
    return custInfoMapper.selectByMap(map);
  }

  @Override
  @CacheEvict(key = "#p0")
  public void deleteById(Integer id) {
    custInfoMapper.deleteById(id);
  }

  @Override
  @CachePut(key = "#p0.id")
  public Custinfo update(Custinfo custinfo) {
    custInfoMapper.updateById(custinfo);
    return custinfo;
  }

  @Override
  @Cacheable(key = "#p0.id")
  public Custinfo insert(Custinfo custinfo) {
    custInfoMapper.insert(custinfo);
    return custinfo;
  }

  @Override
  @Cacheable(key = "'offset:'+#p0+':limit:'+#p1")
  public List<Custinfo> queryAllByLimit(Integer offset, Integer limit) {
    return custInfoMapper.queryAllByLimit(offset,limit);
  }
}
