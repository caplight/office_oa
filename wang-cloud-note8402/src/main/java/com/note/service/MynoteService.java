package com.note.service;


import com.springcloud.commonapi.entities.Mynote;

import java.util.List;

/**
 * (Mynote)表服务接口
 *
 * @author makejava
 * @since 2020-06-29 20:07:46
 */

public interface MynoteService {

    /**
     * 通过实体条件查询
     *
     * @param  mynote 实例对象
     * @return 实例对象
     */
    List<Mynote> queryAll(Mynote mynote);

    /**
     * 通过ID查询单条数据
     *
     * @param mynoteid 主键
     * @return 实例对象
     */
    Mynote queryById(Integer mynoteid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Mynote> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param mynote 实例对象
     * @return 实例对象
     */
    Mynote insert(Mynote mynote);

    /**
     * 修改数据
     *
     * @param mynote 实例对象
     * @return 实例对象
     */
    Mynote update(Mynote mynote);

    /**
     * 通过主键删除数据
     *
     * @param mynoteid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer mynoteid);

}