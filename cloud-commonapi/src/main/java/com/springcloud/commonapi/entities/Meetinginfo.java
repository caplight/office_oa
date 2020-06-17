package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (Meetinginfo)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:20
 */
public class Meetinginfo implements Serializable {
    private static final long serialVersionUID = -16907485075615734L;
    
    private Integer meetinginfoid;
    
    private String meetinginfoname;


    public Integer getMeetinginfoid() {
        return meetinginfoid;
    }

    public void setMeetinginfoid(Integer meetinginfoid) {
        this.meetinginfoid = meetinginfoid;
    }

    public String getMeetinginfoname() {
        return meetinginfoname;
    }

    public void setMeetinginfoname(String meetinginfoname) {
        this.meetinginfoname = meetinginfoname;
    }

}