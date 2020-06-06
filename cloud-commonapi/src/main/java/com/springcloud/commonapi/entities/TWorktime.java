package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TWorktime)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TWorktime implements Serializable {
    private static final long serialVersionUID = -12616445889843623L;
    
    private Integer tWorktimeId;
    
    private String tWorktimeOndutytime;
    
    private String tWorktimeOffdutytime;


    public Integer getTWorktimeId() {
        return tWorktimeId;
    }

    public void setTWorktimeId(Integer tWorktimeId) {
        this.tWorktimeId = tWorktimeId;
    }

    public String getTWorktimeOndutytime() {
        return tWorktimeOndutytime;
    }

    public void setTWorktimeOndutytime(String tWorktimeOndutytime) {
        this.tWorktimeOndutytime = tWorktimeOndutytime;
    }

    public String getTWorktimeOffdutytime() {
        return tWorktimeOffdutytime;
    }

    public void setTWorktimeOffdutytime(String tWorktimeOffdutytime) {
        this.tWorktimeOffdutytime = tWorktimeOffdutytime;
    }

}