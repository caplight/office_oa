package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (Messagetouser)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:20
 */
public class Messagetouser implements Serializable {
    private static final long serialVersionUID = -74929009873568447L;
    
    private Integer messagetouserid;
    
    private Integer messageid;
    
    private Long userinfoid;
    
    private Integer idread;


    public Integer getMessagetouserid() {
        return messagetouserid;
    }

    public void setMessagetouserid(Integer messagetouserid) {
        this.messagetouserid = messagetouserid;
    }

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public Long getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(Long userinfoid) {
        this.userinfoid = userinfoid;
    }

    public Integer getIdread() {
        return idread;
    }

    public void setIdread(Integer idread) {
        this.idread = idread;
    }

}