package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TScheduleob)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TScheduleob implements Serializable {
    private static final long serialVersionUID = 642718531269700904L;
    
    private Integer tScheduleobId;
    
    private Integer tDepartinfoId;
    
    private Integer tScheduleId;
    
    private Integer tUserinfoId;
    
    private Integer tBranchinfoId;


    public Integer getTScheduleobId() {
        return tScheduleobId;
    }

    public void setTScheduleobId(Integer tScheduleobId) {
        this.tScheduleobId = tScheduleobId;
    }

    public Integer getTDepartinfoId() {
        return tDepartinfoId;
    }

    public void setTDepartinfoId(Integer tDepartinfoId) {
        this.tDepartinfoId = tDepartinfoId;
    }

    public Integer getTScheduleId() {
        return tScheduleId;
    }

    public void setTScheduleId(Integer tScheduleId) {
        this.tScheduleId = tScheduleId;
    }

    public Integer getTUserinfoId() {
        return tUserinfoId;
    }

    public void setTUserinfoId(Integer tUserinfoId) {
        this.tUserinfoId = tUserinfoId;
    }

    public Integer getTBranchinfoId() {
        return tBranchinfoId;
    }

    public void setTBranchinfoId(Integer tBranchinfoId) {
        this.tBranchinfoId = tBranchinfoId;
    }

}