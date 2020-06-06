package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TUserinfo)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TUserinfo implements Serializable {
    private static final long serialVersionUID = 129523322790719102L;
    
    private Integer tUserinfoId;
    
    private String tUserinfoName;
    
    private String tUserinfoPassword;
    
    private Integer tDepartinfoId;
    
    private String tUserinfoGender;
    
    private Integer tRoleinfoId;
    
    private Integer tUserstateId;


    public Integer getTUserinfoId() {
        return tUserinfoId;
    }

    public void setTUserinfoId(Integer tUserinfoId) {
        this.tUserinfoId = tUserinfoId;
    }

    public String getTUserinfoName() {
        return tUserinfoName;
    }

    public void setTUserinfoName(String tUserinfoName) {
        this.tUserinfoName = tUserinfoName;
    }

    public String getTUserinfoPassword() {
        return tUserinfoPassword;
    }

    public void setTUserinfoPassword(String tUserinfoPassword) {
        this.tUserinfoPassword = tUserinfoPassword;
    }

    public Integer getTDepartinfoId() {
        return tDepartinfoId;
    }

    public void setTDepartinfoId(Integer tDepartinfoId) {
        this.tDepartinfoId = tDepartinfoId;
    }

    public String getTUserinfoGender() {
        return tUserinfoGender;
    }

    public void setTUserinfoGender(String tUserinfoGender) {
        this.tUserinfoGender = tUserinfoGender;
    }

    public Integer getTRoleinfoId() {
        return tRoleinfoId;
    }

    public void setTRoleinfoId(Integer tRoleinfoId) {
        this.tRoleinfoId = tRoleinfoId;
    }

    public Integer getTUserstateId() {
        return tUserstateId;
    }

    public void setTUserstateId(Integer tUserstateId) {
        this.tUserstateId = tUserstateId;
    }

}