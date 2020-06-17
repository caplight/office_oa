package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (Operatelog)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:20
 */
public class Operatelog implements Serializable {
    private static final long serialVersionUID = 391735046762758740L;
    
    private Integer operatelogid;
    
    private Long userinfoid;
    
    private String operatelogname;
    
    private String operatelogobjectid;
    
    private String operatelogdesc;
    
    private Date operatelogtime;


    public Integer getOperatelogid() {
        return operatelogid;
    }

    public void setOperatelogid(Integer operatelogid) {
        this.operatelogid = operatelogid;
    }

    public Long getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(Long userinfoid) {
        this.userinfoid = userinfoid;
    }

    public String getOperatelogname() {
        return operatelogname;
    }

    public void setOperatelogname(String operatelogname) {
        this.operatelogname = operatelogname;
    }

    public String getOperatelogobjectid() {
        return operatelogobjectid;
    }

    public void setOperatelogobjectid(String operatelogobjectid) {
        this.operatelogobjectid = operatelogobjectid;
    }

    public String getOperatelogdesc() {
        return operatelogdesc;
    }

    public void setOperatelogdesc(String operatelogdesc) {
        this.operatelogdesc = operatelogdesc;
    }

    public Date getOperatelogtime() {
        return operatelogtime;
    }

    public void setOperatelogtime(Date operatelogtime) {
        this.operatelogtime = operatelogtime;
    }

}