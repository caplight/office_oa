package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TManagePower)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TManagePower implements Serializable {
    private static final long serialVersionUID = 239161883746572427L;
    
    private Integer tManagePowerId;
    
    private Integer tManageId;
    
    private Integer tPowerId;


    public Integer getTManagePowerId() {
        return tManagePowerId;
    }

    public void setTManagePowerId(Integer tManagePowerId) {
        this.tManagePowerId = tManagePowerId;
    }

    public Integer getTManageId() {
        return tManageId;
    }

    public void setTManageId(Integer tManageId) {
        this.tManageId = tManageId;
    }

    public Integer getTPowerId() {
        return tPowerId;
    }

    public void setTPowerId(Integer tPowerId) {
        this.tPowerId = tPowerId;
    }

}