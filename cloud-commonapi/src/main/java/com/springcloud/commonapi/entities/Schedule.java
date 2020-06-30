package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (Schedule)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:21
 */
public class Schedule implements Serializable {
    private static final long serialVersionUID = -55931974966549047L;
    
    private Integer scheduleid;
    
    private String scheduletitle;
    
    private String scheduleaddress;
    
    private Integer meetinginfoid;
    
    private Date schedulebegintime;
    
    private Date scheduleendtime;
    
    private String schedulecontent;
    
    private String schedulecreateuser;
    
    private Date schedulecreatetime;
    
    private Integer scheduleifprivate;


    public Integer getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(Integer scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getScheduletitle() {
        return scheduletitle;
    }

    public void setScheduletitle(String scheduletitle) {
        this.scheduletitle = scheduletitle;
    }

    public String getScheduleaddress() {
        return scheduleaddress;
    }

    public void setScheduleaddress(String scheduleaddress) {
        this.scheduleaddress = scheduleaddress;
    }

    public Integer getMeetinginfoid() {
        return meetinginfoid;
    }

    public void setMeetinginfoid(Integer meetinginfoid) {
        this.meetinginfoid = meetinginfoid;
    }

    public Date getSchedulebegintime() {
        return schedulebegintime;
    }

    public void setSchedulebegintime(Date schedulebegintime) {
        this.schedulebegintime = schedulebegintime;
    }

    public Date getScheduleendtime() {
        return scheduleendtime;
    }

    public void setScheduleendtime(Date scheduleendtime) {
        this.scheduleendtime = scheduleendtime;
    }

    public String getSchedulecontent() {
        return schedulecontent;
    }

    public void setSchedulecontent(String schedulecontent) {
        this.schedulecontent = schedulecontent;
    }

    public String getSchedulecreateuser() {
        return schedulecreateuser;
    }

    public void setSchedulecreateuser(String schedulecreateuser) {
        this.schedulecreateuser = schedulecreateuser;
    }

    public Date getSchedulecreatetime() {
        return schedulecreatetime;
    }

    public void setSchedulecreatetime(Date schedulecreatetime) {
        this.schedulecreatetime = schedulecreatetime;
    }

    public Integer getScheduleifprivate() {
        return scheduleifprivate;
    }

    public void setScheduleifprivate(Integer scheduleifprivate) {
        this.scheduleifprivate = scheduleifprivate;
    }

}