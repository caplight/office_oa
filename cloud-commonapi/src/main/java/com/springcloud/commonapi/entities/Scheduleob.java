package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (Scheduleob)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:21
 */
public class Scheduleob implements Serializable {
    private static final long serialVersionUID = 148602096228519412L;
    
    private Integer scheduleobid;
    
    private Integer departinfoid;
    
    private Integer scheduleid;
    
    private Long userinfoid;
    
    private Integer branchinfoid;


    public Integer getScheduleobid() {
        return scheduleobid;
    }

    public void setScheduleobid(Integer scheduleobid) {
        this.scheduleobid = scheduleobid;
    }

    public Integer getDepartinfoid() {
        return departinfoid;
    }

    public void setDepartinfoid(Integer departinfoid) {
        this.departinfoid = departinfoid;
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

    public Integer getBranchinfoid() {
        return branchinfoid;
    }

    public void setBranchinfoid(Integer branchinfoid) {
        this.branchinfoid = branchinfoid;
    }

}