package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (TOperationlog)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TOperationlog implements Serializable {
    private static final long serialVersionUID = 631417924379493811L;
    
    private Integer tOperationlogId;
    
    private String tOperationlogName;
    
    private String tOperationlogUsername;
    
    private Date tOperationlogTime;
    
    private String tOperationlogContent;


    public Integer getTOperationlogId() {
        return tOperationlogId;
    }

    public void setTOperationlogId(Integer tOperationlogId) {
        this.tOperationlogId = tOperationlogId;
    }

    public String getTOperationlogName() {
        return tOperationlogName;
    }

    public void setTOperationlogName(String tOperationlogName) {
        this.tOperationlogName = tOperationlogName;
    }

    public String getTOperationlogUsername() {
        return tOperationlogUsername;
    }

    public void setTOperationlogUsername(String tOperationlogUsername) {
        this.tOperationlogUsername = tOperationlogUsername;
    }

    public Date getTOperationlogTime() {
        return tOperationlogTime;
    }

    public void setTOperationlogTime(Date tOperationlogTime) {
        this.tOperationlogTime = tOperationlogTime;
    }

    public String getTOperationlogContent() {
        return tOperationlogContent;
    }

    public void setTOperationlogContent(String tOperationlogContent) {
        this.tOperationlogContent = tOperationlogContent;
    }

}