package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (Precontract)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:21
 */
public class Precontract implements Serializable {
    private static final long serialVersionUID = -19658014900490201L;
    
    private Integer precontractid;
    
    private Integer scheduleid;
    
    private Long userinfoid;


    public Integer getPrecontractid() {
        return precontractid;
    }

    public void setPrecontractid(Integer precontractid) {
        this.precontractid = precontractid;
    }

    public Integer getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
    }

    public Long getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(Long userinfoid) {
        this.userinfoid = userinfoid;
    }

}