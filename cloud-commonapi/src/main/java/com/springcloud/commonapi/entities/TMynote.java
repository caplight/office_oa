package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (TMynote)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TMynote implements Serializable {
    private static final long serialVersionUID = 786976217096432791L;
    
    private Integer tMynoteId;
    
    private String tMynoteTitle;
    
    private String tMynoteContent;
    
    private Date tMynoteCreatetime;
    
    private String tMynoteCreateuser;


    public Integer getTMynoteId() {
        return tMynoteId;
    }

    public void setTMynoteId(Integer tMynoteId) {
        this.tMynoteId = tMynoteId;
    }

    public String getTMynoteTitle() {
        return tMynoteTitle;
    }

    public void setTMynoteTitle(String tMynoteTitle) {
        this.tMynoteTitle = tMynoteTitle;
    }

    public String getTMynoteContent() {
        return tMynoteContent;
    }

    public void setTMynoteContent(String tMynoteContent) {
        this.tMynoteContent = tMynoteContent;
    }

    public Date getTMynoteCreatetime() {
        return tMynoteCreatetime;
    }

    public void setTMynoteCreatetime(Date tMynoteCreatetime) {
        this.tMynoteCreatetime = tMynoteCreatetime;
    }

    public String getTMynoteCreateuser() {
        return tMynoteCreateuser;
    }

    public void setTMynoteCreateuser(String tMynoteCreateuser) {
        this.tMynoteCreateuser = tMynoteCreateuser;
    }

}