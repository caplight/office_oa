package com.affair.dao;


import com.springcloud.commonapi.entities.Affair;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Affair)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-30 01:35:22
 */
@Mapper
public interface AffairDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Affair queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Affair> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param affair 实例对象
     * @return 对象列表
     */
    List<Affair> queryAll(Affair affair);

    /**
     * 新增数据
     *
     * @param affair 实例对象
     * @return 影响行数
     */
    int insert(Affair affair);

    /**
     * 修改数据
     *
     * @param affair 实例对象
     * @return 影响行数
     */
    int update(Affair affair);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}