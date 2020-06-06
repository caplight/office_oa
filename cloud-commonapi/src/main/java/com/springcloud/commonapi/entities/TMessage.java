package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (TMessage)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TMessage implements Serializable {
    private static final long serialVersionUID = -44577686689588217L;
    
    private Integer tMessageId;
    
    private String tMessageTitle;
    
    private String tMessageContent;
    
    private Integer tMessagetypeId;
    
    private Date tMessageBegintime;
    
    private Date tMessageEndtime;
    
    private String tUserinfoId;
    
    private Integer tMessageIfpublish;
    
    private Date tMessageRecordtime;


    public Integer getTMessageId() {
        return tMessageId;
    }

    public void setTMessageId(Integer tMessageId) {
        this.tMessageId = tMessageId;
    }

    public String getTMessageTitle() {
        return tMessageTitle;
    }

    public void setTMessageTitle(String tMessageTitle) {
        this.tMessageTitle = tMessageTitle;
    }

    public String getTMessageContent() {
        return tMessageContent;
    }

    public void setTMessageContent(String tMessageContent) {
        this.tMessageContent = tMessageContent;
    }

    public Integer getTMessagetypeId() {
        return tMessagetypeId;
    }

    public void setTMessagetypeId(Integer tMessagetypeId) {
        this.tMessagetypeId = tMessagetypeId;
    }

    public Date getTMessageBegintime() {
        return tMessageBegintime;
    }

    public void setTMessageBegintime(Date tMessageBegintime) {
        this.tMessageBegintime = tMessageBegintime;
    }

    public Date getTMessageEndtime() {
        return tMessageEndtime;
    }

    public void setTMessageEndtime(Date tMessageEndtime) {
        this.tMessageEndtime = tMessageEndtime;
    }

    public String getTUserinfoId() {
        return tUserinfoId;
    }

    public void setTUserinfoId(String tUserinfoId) {
        this.tUserinfoId = tUserinfoId;
    }

    public Integer getTMessageIfpublish() {
        return tMessageIfpublish;
    }

    public void setTMessageIfpublish(Integer tMessageIfpublish) {
        this.tMessageIfpublish = tMessageIfpublish;
    }

    public Date getTMessageRecordtime() {
        return tMessageRecordtime;
    }

    public void setTMessageRecordtime(Date tMessageRecordtime) {
        this.tMessageRecordtime = tMessageRecordtime;
    }

}