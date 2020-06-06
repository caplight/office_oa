package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TPrecontract)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TPrecontract implements Serializable {
    private static final long serialVersionUID = 899326722365742578L;
    
    private Integer tPrecontractId;
    
    private Integer tScheduleId;
    
    private Integer tUserinfoId;


    public Integer getTPrecontractId() {
        return tPrecontractId;
    }

    public void setTPrecontractId(Integer tPrecontractId) {
        this.tPrecontractId = tPrecontractId;
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

}