package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TPower)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TPower implements Serializable {
    private static final long serialVersionUID = 858391790420641342L;
    
    private Integer tPowerId;
    
    private String tPowerName;
    
    private String tPowerUri;


    public Integer getTPowerId() {
        return tPowerId;
    }

    public void setTPowerId(Integer tPowerId) {
        this.tPowerId = tPowerId;
    }

    public String getTPowerName() {
        return tPowerName;
    }

    public void setTPowerName(String tPowerName) {
        this.tPowerName = tPowerName;
    }

    public String getTPowerUri() {
        return tPowerUri;
    }

    public void setTPowerUri(String tPowerUri) {
        this.tPowerUri = tPowerUri;
    }

}