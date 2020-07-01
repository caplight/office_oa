package com.stock.service.impl;


import com.springcloud.commonapi.entities.Commsg;
import com.stock.dao.CommsgDao;
import com.stock.service.CommsgService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Commsg)表服务实现类
 *
 * @author makejava
 * @since 2020-07-01 06:59:42
 */
@Service("commsgService")
public class CommsgServiceImpl implements CommsgService {
    @Resource
    private CommsgDao commsgDao;


    /**
     * 通过实体条件查询
     *
     * @param commsg 实例对象
     * @return 实例对象
     */
    public List<Commsg> queryAll(Commsg commsg){
       return this.commsgDao.queryAll(commsg);
   }

    /**
     * 通过ID查询单条数据
     *
     * @param cno 主键
     * @return 实例对象
     */
    @Override
    public Commsg queryById(Integer cno) {
        return this.commsgDao.queryById(cno);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Commsg> queryAllByLimit(int offset, int limit) {
        return this.commsgDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param commsg 实例对象
     * @return 实例对象
     */
    @Override
    public Commsg insert(Commsg commsg) {
        this.commsgDao.insert(commsg);
        return commsg;
    }

    /**
     * 修改数据
     *
     * @param commsg 实例对象
     * @return 实例对象
     */
    @Override
    public Commsg update(Commsg commsg) {
        this.commsgDao.update(commsg);
        return this.queryById(commsg.getCno());
    }

    /**
     * 通过主键删除数据
     *
     * @param cno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cno) {
        return this.commsgDao.deleteById(cno) > 0;
    }
}