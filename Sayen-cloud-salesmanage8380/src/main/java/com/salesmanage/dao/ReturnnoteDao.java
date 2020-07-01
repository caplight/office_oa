package com.salesmanage.dao;

import com.salesmanage.entity.Returnnote;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Returnnote)表数据库访问层
 *
 * @author Sayen
 * @since 2020-06-26 11:49:33
 */
@Mapper
public interface ReturnnoteDao {

    /**
     * 通过ID查询单条数据
     *
     * @param returnId 主键
     * @return 实例对象
     */
    Returnnote queryById(String returnId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Returnnote> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param returnnote 实例对象
     * @return 对象列表
     */
    List<Returnnote> queryAll(Returnnote returnnote);

    /**
     * 新增数据
     *
     * @param returnnote 实例对象
     * @return 影响行数
     */
    int insert(Returnnote returnnote);

    /**
     * 修改数据
     *
     * @param returnnote 实例对象
     * @return 影响行数
     */
    int update(Returnnote returnnote);

    /**
     * 通过主键删除数据
     *
     * @param returnId 主键
     * @return 影响行数
     */
    int deleteById(String returnId);

}