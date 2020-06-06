package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TManage)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TManage implements Serializable {
    private static final long serialVersionUID = -69333367774882474L;
    
    private Integer tManageId;
    
    private String tManageName;


    public Integer getTManageId() {
        return tManageId;
    }

    public void setTManageId(Integer tManageId) {
        this.tManageId = tManageId;
    }

    public String getTManageName() {
        return tManageName;
    }

    public void setTManageName(String tManageName) {
        this.tManageName = tManageName;
    }

}