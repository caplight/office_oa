package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (TLoginlog)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TLoginlog implements Serializable {
    private static final long serialVersionUID = -38420513090614181L;
    
    private Integer tLoginlogId;
    
    private Integer tUserinfoId;
    
    private Date tLoginlogTime;
    
    private Integer tLoginlogIfsuccess;
    
    private String tLoginlogUserip;
    
    private String tLoginlogDesc;


    public Integer getTLoginlogId() {
        return tLoginlogId;
    }

    public void setTLoginlogId(Integer tLoginlogId) {
        this.tLoginlogId = tLoginlogId;
    }

    public Integer getTUserinfoId() {
        return tUserinfoId;
    }

    public void setTUserinfoId(Integer tUserinfoId) {
        this.tUserinfoId = tUserinfoId;
    }

    public Date getTLoginlogTime() {
        return tLoginlogTime;
    }

    public void setTLoginlogTime(Date tLoginlogTime) {
        this.tLoginlogTime = tLoginlogTime;
    }

    public Integer getTLoginlogIfsuccess() {
        return tLoginlogIfsuccess;
    }

    public void setTLoginlogIfsuccess(Integer tLoginlogIfsuccess) {
        this.tLoginlogIfsuccess = tLoginlogIfsuccess;
    }

    public String getTLoginlogUserip() {
        return tLoginlogUserip;
    }

    public void setTLoginlogUserip(String tLoginlogUserip) {
        this.tLoginlogUserip = tLoginlogUserip;
    }

    public String getTLoginlogDesc() {
        return tLoginlogDesc;
    }

    public void setTLoginlogDesc(String tLoginlogDesc) {
        this.tLoginlogDesc = tLoginlogDesc;
    }

}