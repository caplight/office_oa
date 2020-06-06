package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TBranchinfo)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:17
 */
public class TBranchinfo implements Serializable {
    private static final long serialVersionUID = -93405006236124590L;
    
    private Integer tBranchinfoId;
    
    private String tBranchinfoName;
    
    private String tBranchinfoShortname;


    public Integer getTBranchinfoId() {
        return tBranchinfoId;
    }

    public void setTBranchinfoId(Integer tBranchinfoId) {
        this.tBranchinfoId = tBranchinfoId;
    }

    public String getTBranchinfoName() {
        return tBranchinfoName;
    }

    public void setTBranchinfoName(String tBranchinfoName) {
        this.tBranchinfoName = tBranchinfoName;
    }

    public String getTBranchinfoShortname() {
        return tBranchinfoShortname;
    }

    public void setTBranchinfoShortname(String tBranchinfoShortname) {
        this.tBranchinfoShortname = tBranchinfoShortname;
    }

}