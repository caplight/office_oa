package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TMessagetype)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TMessagetype implements Serializable {
    private static final long serialVersionUID = 419014242382980871L;
    
    private Integer tMessagetypeId;
    
    private String tMessagetypeName;
    
    private String tMessagetypeDesc;


    public Integer getTMessagetypeId() {
        return tMessagetypeId;
    }

    public void setTMessagetypeId(Integer tMessagetypeId) {
        this.tMessagetypeId = tMessagetypeId;
    }

    public String getTMessagetypeName() {
        return tMessagetypeName;
    }

    public void setTMessagetypeName(String tMessagetypeName) {
        this.tMessagetypeName = tMessagetypeName;
    }

    public String getTMessagetypeDesc() {
        return tMessagetypeDesc;
    }

    public void setTMessagetypeDesc(String tMessagetypeDesc) {
        this.tMessagetypeDesc = tMessagetypeDesc;
    }

}