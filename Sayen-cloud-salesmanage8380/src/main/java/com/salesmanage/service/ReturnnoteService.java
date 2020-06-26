package com.salesmanage.service;

import com.salesmanage.entity.Returnnote;
import java.util.List;

/**
 * (Returnnote)表服务接口
 *
 * @author makejava
 * @since 2020-06-26 11:49:33
 */
public interface ReturnnoteService {

    /**
     * 通过ID查询单条数据
     *
     * @param returnId 主键
     * @return 实例对象
     */
    Returnnote queryById(String returnId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Returnnote> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param returnnote 实例对象
     * @return 实例对象
     */
    Returnnote insert(Returnnote returnnote);

    /**
     * 修改数据
     *
     * @param returnnote 实例对象
     * @return 实例对象
     */
    Returnnote update(Returnnote returnnote);

    /**
     * 通过主键删除数据
     *
     * @param returnId 主键
     * @return 是否成功
     */
    boolean deleteById(String returnId);

}