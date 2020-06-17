package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (Manualsign)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:20
 */
public class Manualsign implements Serializable {
    private static final long serialVersionUID = -11010894293630647L;
    
    private Integer manualsignid;
    
    private Long userinfoid;
    
    private Date manualsigntime;
    
    private String manualsigndesc;
    
    private Integer manualsigntag;


    public Integer getManualsignid() {
        return manualsignid;
    }

    public void setManualsignid(Integer manualsignid) {
        this.manualsignid = manualsignid;
    }

    public Long getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(Long userinfoid) {
        this.userinfoid = userinfoid;
    }

    public Date getManualsigntime() {
        return manualsigntime;
    }

    public void setManualsigntime(Date manualsigntime) {
        this.manualsigntime = manualsigntime;
    }

    public String getManualsigndesc() {
        return manualsigndesc;
    }

    public void setManualsigndesc(String manualsigndesc) {
        this.manualsigndesc = manualsigndesc;
    }

    public Integer getManualsigntag() {
        return manualsigntag;
    }

    public void setManualsigntag(Integer manualsigntag) {
        this.manualsigntag = manualsigntag;
    }

}