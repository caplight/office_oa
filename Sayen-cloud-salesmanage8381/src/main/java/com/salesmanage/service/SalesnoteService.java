package com.salesmanage.service;

import com.salesmanage.entity.Salesnote;

import java.util.List;

/**
 * (Salesnote)表服务接口
 *
 * @author Sayen
 * @since 2020-06-26 11:49:14
 */
public interface SalesnoteService {

    /**
     * 通过ID查询单条数据
     *
     * @param salesid 主键
     * @return 实例对象
     */
    Salesnote queryById(String salesid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Salesnote> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param salesnote 实例对象
     * @return 实例对象
     */
    Salesnote insert(Salesnote salesnote);

    /**
     * 修改数据
     *
     * @param salesnote 实例对象
     * @return 实例对象
     */
    Salesnote update(Salesnote salesnote);

    /**
     * 通过主键删除数据
     *
     * @param salesid 主键
     * @return 是否成功
     */
    boolean deleteById(String salesid);

}