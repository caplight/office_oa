package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (Message)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:20
 */
public class Message implements Serializable {
    private static final long serialVersionUID = -38790373842507492L;
    
    private Integer messageid;
    
    private String messagetitle;
    
    private String messagecontent;
    
    private Integer messagetypeid;
    
    private Date messagebegintime;
    
    private Date messageendtime;
    
    private Long userinfoid;
    
    private Integer messageifpublish;
    
    private Date messagerecordtime;


    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public String getMessagetitle() {
        return messagetitle;
    }

    public void setMessagetitle(String messagetitle) {
        this.messagetitle = messagetitle;
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent;
    }

    public Integer getMessagetypeid() {
        return messagetypeid;
    }

    public void setMessagetypeid(Integer messagetypeid) {
        this.messagetypeid = messagetypeid;
    }

    public Date getMessagebegintime() {
        return messagebegintime;
    }

    public void setMessagebegintime(Date messagebegintime) {
        this.messagebegintime = messagebegintime;
    }

    public Date getMessageendtime() {
        return messageendtime;
    }

    public void setMessageendtime(Date messageendtime) {
        this.messageendtime = messageendtime;
    }

    public Long getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(Long userinfoid) {
        this.userinfoid = userinfoid;
    }

    public Integer getMessageifpublish() {
        return messageifpublish;
    }

    public void setMessageifpublish(Integer messageifpublish) {
        this.messageifpublish = messageifpublish;
    }

    public Date getMessagerecordtime() {
        return messagerecordtime;
    }

    public void setMessagerecordtime(Date messagerecordtime) {
        this.messagerecordtime = messagerecordtime;
    }

}