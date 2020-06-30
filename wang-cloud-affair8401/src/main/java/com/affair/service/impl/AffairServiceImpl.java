package com.affair.service.impl;

import com.affair.dao.AffairDao;
import com.affair.service.AffairService;
import com.springcloud.commonapi.entities.Affair;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Affair)表服务实现类
 *
 * @author makejava
 * @since 2020-06-30 01:35:23
 */
@Service("affairService")
public class AffairServiceImpl implements AffairService {
    @Resource
    private AffairDao affairDao;


    /**
     * 通过实体条件查询
     *
     * @param affair 实例对象
     * @return 实例对象
     */
    public List<Affair> queryAll(Affair affair){
       return this.affairDao.queryAll(affair);
   }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Affair queryById(Integer id) {
        return this.affairDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Affair> queryAllByLimit(int offset, int limit) {
        return this.affairDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param affair 实例对象
     * @return 实例对象
     */
    @Override
    public Affair insert(Affair affair) {
        this.affairDao.insert(affair);
        return affair;
    }

    /**
     * 修改数据
     *
     * @param affair 实例对象
     * @return 实例对象
     */
    @Override
    public Affair update(Affair affair) {
        this.affairDao.update(affair);
        return this.queryById(affair.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.affairDao.deleteById(id) > 0;
    }
}