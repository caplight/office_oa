package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (Mynote)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:20
 */
public class Mynote implements Serializable {
    private static final long serialVersionUID = 143501615463638383L;
    
    private Integer mynoteid;
    
    private String mynotetitle;
    
    private String mynotecontent;
    
    private Date mynotecreatetime;
    
    private String mynotecreateuser;


    public Integer getMynoteid() {
        return mynoteid;
    }

    public void setMynoteid(Integer mynoteid) {
        this.mynoteid = mynoteid;
    }

    public String getMynotetitle() {
        return mynotetitle;
    }

    public void setMynotetitle(String mynotetitle) {
        this.mynotetitle = mynotetitle;
    }

    public String getMynotecontent() {
        return mynotecontent;
    }

    public void setMynotecontent(String mynotecontent) {
        this.mynotecontent = mynotecontent;
    }

    public Date getMynotecreatetime() {
        return mynotecreatetime;
    }

    public void setMynotecreatetime(Date mynotecreatetime) {
        this.mynotecreatetime = mynotecreatetime;
    }

    public String getMynotecreateuser() {
        return mynotecreateuser;
    }

    public void setMynotecreateuser(String mynotecreateuser) {
        this.mynotecreateuser = mynotecreateuser;
    }

}