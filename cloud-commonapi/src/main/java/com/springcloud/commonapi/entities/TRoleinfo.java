package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TRoleinfo)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TRoleinfo implements Serializable {
    private static final long serialVersionUID = -53780574147882034L;
    
    private Integer tRoleinfoId;
    
    private String tRoleinfoName;
    
    private String tRoleinfoDesc;


    public Integer getTRoleinfoId() {
        return tRoleinfoId;
    }

    public void setTRoleinfoId(Integer tRoleinfoId) {
        this.tRoleinfoId = tRoleinfoId;
    }

    public String getTRoleinfoName() {
        return tRoleinfoName;
    }

    public void setTRoleinfoName(String tRoleinfoName) {
        this.tRoleinfoName = tRoleinfoName;
    }

    public String getTRoleinfoDesc() {
        return tRoleinfoDesc;
    }

    public void setTRoleinfoDesc(String tRoleinfoDesc) {
        this.tRoleinfoDesc = tRoleinfoDesc;
    }

}