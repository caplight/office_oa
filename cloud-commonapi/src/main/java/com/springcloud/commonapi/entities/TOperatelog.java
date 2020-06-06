package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (TOperatelog)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TOperatelog implements Serializable {
    private static final long serialVersionUID = 344909408974888563L;
    
    private Integer tOperatelogId;
    
    private Integer tUserinfoId;
    
    private String tOperatelogName;
    
    private String tOperatelogObjectid;
    
    private String tOperatelogDesc;
    
    private Date tOperatelogTime;


    public Integer getTOperatelogId() {
        return tOperatelogId;
    }

    public void setTOperatelogId(Integer tOperatelogId) {
        this.tOperatelogId = tOperatelogId;
    }

    public Integer getTUserinfoId() {
        return tUserinfoId;
    }

    public void setTUserinfoId(Integer tUserinfoId) {
        this.tUserinfoId = tUserinfoId;
    }

    public String getTOperatelogName() {
        return tOperatelogName;
    }

    public void setTOperatelogName(String tOperatelogName) {
        this.tOperatelogName = tOperatelogName;
    }

    public String getTOperatelogObjectid() {
        return tOperatelogObjectid;
    }

    public void setTOperatelogObjectid(String tOperatelogObjectid) {
        this.tOperatelogObjectid = tOperatelogObjectid;
    }

    public String getTOperatelogDesc() {
        return tOperatelogDesc;
    }

    public void setTOperatelogDesc(String tOperatelogDesc) {
        this.tOperatelogDesc = tOperatelogDesc;
    }

    public Date getTOperatelogTime() {
        return tOperatelogTime;
    }

    public void setTOperatelogTime(Date tOperatelogTime) {
        this.tOperatelogTime = tOperatelogTime;
    }

}