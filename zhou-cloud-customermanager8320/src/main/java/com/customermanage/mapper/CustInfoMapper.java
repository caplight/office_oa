package com.customermanage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springcloud.commonapi.entities.Custinfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhou
 * @date 2020/6/27 2:05
 */
@Mapper
public interface CustInfoMapper extends BaseMapper<Custinfo> {
}
