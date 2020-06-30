package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (Loginlog)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:20
 */
public class Loginlog implements Serializable {
    private static final long serialVersionUID = -62878497704972267L;
    
    private Integer loginlogid;
    
    private Long userinfoid;
    
    private Date loginlogtime;
    
    private Integer loginlogifsuccess;
    
    private String loginloguserip;
    
    private String loginlogdesc;


    public Integer getLoginlogid() {
        return loginlogid;
    }

    public void setLoginlogid(Integer loginlogid) {
        this.loginlogid = loginlogid;
    }

    public Long getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(Long userinfoid) {
        this.userinfoid = userinfoid;
    }

    public Date getLoginlogtime() {
        return loginlogtime;
    }

    public void setLoginlogtime(Date loginlogtime) {
        this.loginlogtime = loginlogtime;
    }

    public Integer getLoginlogifsuccess() {
        return loginlogifsuccess;
    }

    public void setLoginlogifsuccess(Integer loginlogifsuccess) {
        this.loginlogifsuccess = loginlogifsuccess;
    }

    public String getLoginloguserip() {
        return loginloguserip;
    }

    public void setLoginloguserip(String loginloguserip) {
        this.loginloguserip = loginloguserip;
    }

    public String getLoginlogdesc() {
        return loginlogdesc;
    }

    public void setLoginlogdesc(String loginlogdesc) {
        this.loginlogdesc = loginlogdesc;
    }

}