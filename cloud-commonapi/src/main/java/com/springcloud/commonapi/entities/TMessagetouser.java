package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TMessagetouser)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TMessagetouser implements Serializable {
    private static final long serialVersionUID = -80081374798436614L;
    
    private Integer tMessagetouserId;
    
    private Integer tMessageId;
    
    private Integer tUserinfoId;
    
    private Integer tIdRead;


    public Integer getTMessagetouserId() {
        return tMessagetouserId;
    }

    public void setTMessagetouserId(Integer tMessagetouserId) {
        this.tMessagetouserId = tMessagetouserId;
    }

    public Integer getTMessageId() {
        return tMessageId;
    }

    public void setTMessageId(Integer tMessageId) {
        this.tMessageId = tMessageId;
    }

    public Integer getTUserinfoId() {
        return tUserinfoId;
    }

    public void setTUserinfoId(Integer tUserinfoId) {
        this.tUserinfoId = tUserinfoId;
    }

    public Integer getTIdRead() {
        return tIdRead;
    }

    public void setTIdRead(Integer tIdRead) {
        this.tIdRead = tIdRead;
    }

}