package com.stock.dao;


import com.springcloud.commonapi.entities.Commsg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Commsg)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-01 06:59:38
 */
@Mapper
public interface CommsgDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cno 主键
     * @return 实例对象
     */
    Commsg queryById(Integer cno);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Commsg> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param commsg 实例对象
     * @return 对象列表
     */
    List<Commsg> queryAll(Commsg commsg);

    /**
     * 新增数据
     *
     * @param commsg 实例对象
     * @return 影响行数
     */
    int insert(Commsg commsg);

    /**
     * 修改数据
     *
     * @param commsg 实例对象
     * @return 影响行数
     */
    int update(Commsg commsg);

    /**
     * 通过主键删除数据
     *
     * @param cno 主键
     * @return 影响行数
     */
    int deleteById(Integer cno);

}