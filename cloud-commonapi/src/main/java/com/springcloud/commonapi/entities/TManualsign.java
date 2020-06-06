package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (TManualsign)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TManualsign implements Serializable {
    private static final long serialVersionUID = 999281962629869262L;
    
    private Integer tManualsignId;
    
    private Integer tUserinfoId;
    
    private Date tManualsignTime;
    
    private String tManualsignDesc;
    
    private Integer tManualsignTag;


    public Integer getTManualsignId() {
        return tManualsignId;
    }

    public void setTManualsignId(Integer tManualsignId) {
        this.tManualsignId = tManualsignId;
    }

    public Integer getTUserinfoId() {
        return tUserinfoId;
    }

    public void setTUserinfoId(Integer tUserinfoId) {
        this.tUserinfoId = tUserinfoId;
    }

    public Date getTManualsignTime() {
        return tManualsignTime;
    }

    public void setTManualsignTime(Date tManualsignTime) {
        this.tManualsignTime = tManualsignTime;
    }

    public String getTManualsignDesc() {
        return tManualsignDesc;
    }

    public void setTManualsignDesc(String tManualsignDesc) {
        this.tManualsignDesc = tManualsignDesc;
    }

    public Integer getTManualsignTag() {
        return tManualsignTag;
    }

    public void setTManualsignTag(Integer tManualsignTag) {
        this.tManualsignTag = tManualsignTag;
    }

}