package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (TSchedule)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TSchedule implements Serializable {
    private static final long serialVersionUID = -58103512217475186L;
    
    private Integer tScheduleId;
    
    private String tScheduleTitle;
    
    private String tScheduleAddress;
    
    private Integer tMeetinginfoId;
    
    private Date tScheduleBegintime;
    
    private Date tScheduleEndtime;
    
    private String tScheduleContent;
    
    private String tScheduleCreateuser;
    
    private Date tScheduleCreatetime;
    
    private Integer tScheduleIfprivate;


    public Integer getTScheduleId() {
        return tScheduleId;
    }

    public void setTScheduleId(Integer tScheduleId) {
        this.tScheduleId = tScheduleId;
    }

    public String getTScheduleTitle() {
        return tScheduleTitle;
    }

    public void setTScheduleTitle(String tScheduleTitle) {
        this.tScheduleTitle = tScheduleTitle;
    }

    public String getTScheduleAddress() {
        return tScheduleAddress;
    }

    public void setTScheduleAddress(String tScheduleAddress) {
        this.tScheduleAddress = tScheduleAddress;
    }

    public Integer getTMeetinginfoId() {
        return tMeetinginfoId;
    }

    public void setTMeetinginfoId(Integer tMeetinginfoId) {
        this.tMeetinginfoId = tMeetinginfoId;
    }

    public Date getTScheduleBegintime() {
        return tScheduleBegintime;
    }

    public void setTScheduleBegintime(Date tScheduleBegintime) {
        this.tScheduleBegintime = tScheduleBegintime;
    }

    public Date getTScheduleEndtime() {
        return tScheduleEndtime;
    }

    public void setTScheduleEndtime(Date tScheduleEndtime) {
        this.tScheduleEndtime = tScheduleEndtime;
    }

    public String getTScheduleContent() {
        return tScheduleContent;
    }

    public void setTScheduleContent(String tScheduleContent) {
        this.tScheduleContent = tScheduleContent;
    }

    public String getTScheduleCreateuser() {
        return tScheduleCreateuser;
    }

    public void setTScheduleCreateuser(String tScheduleCreateuser) {
        this.tScheduleCreateuser = tScheduleCreateuser;
    }

    public Date getTScheduleCreatetime() {
        return tScheduleCreatetime;
    }

    public void setTScheduleCreatetime(Date tScheduleCreatetime) {
        this.tScheduleCreatetime = tScheduleCreatetime;
    }

    public Integer getTScheduleIfprivate() {
        return tScheduleIfprivate;
    }

    public void setTScheduleIfprivate(Integer tScheduleIfprivate) {
        this.tScheduleIfprivate = tScheduleIfprivate;
    }

}