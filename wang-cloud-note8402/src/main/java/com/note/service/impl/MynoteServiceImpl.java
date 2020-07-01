package com.note.service.impl;


import com.note.dao.MynoteDao;
import com.note.service.MynoteService;
import com.springcloud.commonapi.entities.Mynote;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Mynote)表服务实现类
 *
 * @author makejava
 * @since 2020-06-29 20:07:46
 */
@Service("mynoteService")
public class MynoteServiceImpl implements MynoteService {
    @Resource
    private MynoteDao mynoteDao;


    /**
     * 通过实体条件查询
     *
     * @param mynote 实例对象
     * @return 实例对象
     */
    public List<Mynote> queryAll(Mynote mynote){
       return this.mynoteDao.queryAll(mynote);
   }

    /**
     * 通过ID查询单条数据
     *
     * @param mynoteid 主键
     * @return 实例对象
     */
    @Override
    public Mynote queryById(Integer mynoteid) {
        return this.mynoteDao.queryById(mynoteid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Mynote> queryAllByLimit(int offset, int limit) {
        return this.mynoteDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param mynote 实例对象
     * @return 实例对象
     */
    @Override
    public Mynote insert(Mynote mynote) {
        this.mynoteDao.insert(mynote);
        return mynote;
    }

    /**
     * 修改数据
     *
     * @param mynote 实例对象
     * @return 实例对象
     */
    @Override
    public Mynote update(Mynote mynote) {
        this.mynoteDao.update(mynote);
        return this.queryById(mynote.getMynoteid());
    }

    /**
     * 通过主键删除数据
     *
     * @param mynoteid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer mynoteid) {
        return this.mynoteDao.deleteById(mynoteid) > 0;
    }
}