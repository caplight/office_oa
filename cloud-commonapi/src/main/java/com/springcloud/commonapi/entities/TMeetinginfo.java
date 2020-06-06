package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TMeetinginfo)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TMeetinginfo implements Serializable {
    private static final long serialVersionUID = 691224915849546321L;
    
    private Integer tMeetinginfoId;
    
    private String tMeetinginfoName;


    public Integer getTMeetinginfoId() {
        return tMeetinginfoId;
    }

    public void setTMeetinginfoId(Integer tMeetinginfoId) {
        this.tMeetinginfoId = tMeetinginfoId;
    }

    public String getTMeetinginfoName() {
        return tMeetinginfoName;
    }

    public void setTMeetinginfoName(String tMeetinginfoName) {
        this.tMeetinginfoName = tMeetinginfoName;
    }

}