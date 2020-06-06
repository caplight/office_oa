package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TRoleinfoManage)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TRoleinfoManage implements Serializable {
    private static final long serialVersionUID = -80135048887278574L;
    
    private Integer tRoleinfoManageId;
    
    private Integer tRoleinfoId;
    
    private Integer tManageId;


    public Integer getTRoleinfoManageId() {
        return tRoleinfoManageId;
    }

    public void setTRoleinfoManageId(Integer tRoleinfoManageId) {
        this.tRoleinfoManageId = tRoleinfoManageId;
    }

    public Integer getTRoleinfoId() {
        return tRoleinfoId;
    }

    public void setTRoleinfoId(Integer tRoleinfoId) {
        this.tRoleinfoId = tRoleinfoId;
    }

    public Integer getTManageId() {
        return tManageId;
    }

    public void setTManageId(Integer tManageId) {
        this.tManageId = tManageId;
    }

}