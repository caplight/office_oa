package com.salesmanage.dao;

import com.salesmanage.entity.Salesnote;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Salesnote)表数据库访问层
 *
 * @author Sayen
 * @since 2020-06-26 11:49:13
 */
@Mapper
public interface SalesnoteDao {

    /**
     * 通过ID查询单条数据
     *
     * @param salesid 主键
     * @return 实例对象
     */
    Salesnote queryById(String salesid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Salesnote> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param salesnote 实例对象
     * @return 对象列表
     */
    List<Salesnote> queryAll(Salesnote salesnote);

    /**
     * 新增数据
     *
     * @param salesnote 实例对象
     * @return 影响行数
     */
    int insert(Salesnote salesnote);

    /**
     * 修改数据
     *
     * @param salesnote 实例对象
     * @return 影响行数
     */
    int update(Salesnote salesnote);

    /**
     * 通过主键删除数据
     *
     * @param salesid 主键
     * @return 影响行数
     */
    int deleteById(String salesid);

}