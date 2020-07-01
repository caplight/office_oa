package com.stock.service;


import com.springcloud.commonapi.entities.Commsg;

import java.util.List;

/**
 * (Commsg)表服务接口
 *
 * @author makejava
 * @since 2020-07-01 06:59:41
 */
public interface CommsgService {

    /**
     * 通过实体条件查询
     *
     * @param  commsg 实例对象
     * @return 实例对象
     */
    List<Commsg> queryAll(Commsg commsg);

    /**
     * 通过ID查询单条数据
     *
     * @param cno 主键
     * @return 实例对象
     */
    Commsg queryById(Integer cno);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Commsg> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param commsg 实例对象
     * @return 实例对象
     */
    Commsg insert(Commsg commsg);

    /**
     * 修改数据
     *
     * @param commsg 实例对象
     * @return 实例对象
     */
    Commsg update(Commsg commsg);

    /**
     * 通过主键删除数据
     *
     * @param cno 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cno);

}