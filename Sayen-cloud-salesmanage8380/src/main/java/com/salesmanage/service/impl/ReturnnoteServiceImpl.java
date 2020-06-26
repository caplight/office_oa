package com.salesmanage.service.impl;

import com.salesmanage.entity.Returnnote;
import com.salesmanage.dao.ReturnnoteDao;
import com.salesmanage.service.ReturnnoteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Returnnote)表服务实现类
 *
 * @author makejava
 * @since 2020-06-26 11:49:33
 */
@Service("returnnoteService")
public class ReturnnoteServiceImpl implements ReturnnoteService {
    @Resource
    private ReturnnoteDao returnnoteDao;

    /**
     * 通过ID查询单条数据
     *
     * @param returnId 主键
     * @return 实例对象
     */
    @Override
    public Returnnote queryById(String returnId) {
        return this.returnnoteDao.queryById(returnId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Returnnote> queryAllByLimit(int offset, int limit) {
        return this.returnnoteDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param returnnote 实例对象
     * @return 实例对象
     */
    @Override
    public Returnnote insert(Returnnote returnnote) {
        this.returnnoteDao.insert(returnnote);
        return returnnote;
    }

    /**
     * 修改数据
     *
     * @param returnnote 实例对象
     * @return 实例对象
     */
    @Override
    public Returnnote update(Returnnote returnnote) {
        this.returnnoteDao.update(returnnote);
        return this.queryById(returnnote.getReturnId());
    }

    /**
     * 通过主键删除数据
     *
     * @param returnId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String returnId) {
        return this.returnnoteDao.deleteById(returnId) > 0;
    }
}