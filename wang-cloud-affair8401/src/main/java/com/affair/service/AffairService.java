package com.affair.service;


import com.springcloud.commonapi.entities.Affair;

import java.util.List;

/**
 * (Affair)表服务接口
 *
 * @author makejava
 * @since 2020-06-30 01:35:23
 */
public interface AffairService {

    /**
     * 通过实体条件查询
     *
     * @param  affair 实例对象
     * @return 实例对象
     */
    List<Affair> queryAll(Affair affair);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Affair queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Affair> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param affair 实例对象
     * @return 实例对象
     */
    Affair insert(Affair affair);

    /**
     * 修改数据
     *
     * @param affair 实例对象
     * @return 实例对象
     */
    Affair update(Affair affair);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}