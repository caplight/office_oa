package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (Messagetype)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:20
 */
public class Messagetype implements Serializable {
    private static final long serialVersionUID = -98774813969330518L;
    
    private Integer messagetypeid;
    
    private String messagetypename;
    
    private String messagetypedesc;


    public Integer getMessagetypeid() {
        return messagetypeid;
    }

    public void setMessagetypeid(Integer messagetypeid) {
        this.messagetypeid = messagetypeid;
    }

    public String getMessagetypename() {
        return messagetypename;
    }

    public void setMessagetypename(String messagetypename) {
        this.messagetypename = messagetypename;
    }

    public String getMessagetypedesc() {
        return messagetypedesc;
    }

    public void setMessagetypedesc(String messagetypedesc) {
        this.messagetypedesc = messagetypedesc;
    }

}