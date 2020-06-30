package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (Worktime)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:21
 */
public class Worktime implements Serializable {
    private static final long serialVersionUID = 506925726970117867L;
    
    private Integer worktimeid;
    
    private String worktimeondutytime;
    
    private String worktimeoffdutytime;


    public Integer getWorktimeid() {
        return worktimeid;
    }

    public void setWorktimeid(Integer worktimeid) {
        this.worktimeid = worktimeid;
    }

    public String getWorktimeondutytime() {
        return worktimeondutytime;
    }

    public void setWorktimeondutytime(String worktimeondutytime) {
        this.worktimeondutytime = worktimeondutytime;
    }

    public String getWorktimeoffdutytime() {
        return worktimeoffdutytime;
    }

    public void setWorktimeoffdutytime(String worktimeoffdutytime) {
        this.worktimeoffdutytime = worktimeoffdutytime;
    }

}