package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TUserstate)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TUserstate implements Serializable {
    private static final long serialVersionUID = -74970241946385140L;
    
    private Integer tUserstateId;
    
    private String tUserstateName;


    public Integer getTUserstateId() {
        return tUserstateId;
    }

    public void setTUserstateId(Integer tUserstateId) {
        this.tUserstateId = tUserstateId;
    }

    public String getTUserstateName() {
        return tUserstateName;
    }

    public void setTUserstateName(String tUserstateName) {
        this.tUserstateName = tUserstateName;
    }

}