package com.salesmanage.service.impl;

import com.salesmanage.entity.Salesnote;
import com.salesmanage.dao.SalesnoteDao;
import com.salesmanage.service.SalesnoteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Salesnote)表服务实现类
 *
 * @author makejava
 * @since 2020-06-26 11:49:14
 */
@Service("salesnoteService")
public class SalesnoteServiceImpl implements SalesnoteService {
    @Resource
    private SalesnoteDao salesnoteDao;

    /**
     * 通过ID查询单条数据
     *
     * @param salesid 主键
     * @return 实例对象
     */
    @Override
    public Salesnote queryById(String salesid) {
        return this.salesnoteDao.queryById(salesid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Salesnote> queryAllByLimit(int offset, int limit) {
        return this.salesnoteDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param salesnote 实例对象
     * @return 实例对象
     */
    @Override
    public Salesnote insert(Salesnote salesnote) {
        this.salesnoteDao.insert(salesnote);
        return salesnote;
    }

    /**
     * 修改数据
     *
     * @param salesnote 实例对象
     * @return 实例对象
     */
    @Override
    public Salesnote update(Salesnote salesnote) {
        this.salesnoteDao.update(salesnote);
        return this.queryById(salesnote.getSalesid());
    }

    /**
     * 通过主键删除数据
     *
     * @param salesid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String salesid) {
        return this.salesnoteDao.deleteById(salesid) > 0;
    }
}