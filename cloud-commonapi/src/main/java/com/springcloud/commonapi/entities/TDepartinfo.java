package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TDepartinfo)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TDepartinfo implements Serializable {
    private static final long serialVersionUID = -17822294862102064L;
    
    private Integer tDepartinfoId;
    
    private String tDepartinfoName;
    
    private Integer tUserinfoId;
    
    private Long tDepartinfoTel;
    
    private Long tDepartinfoMobiletel;
    
    private Long tDepartinfoFaxes;
    
    private Integer tBranchinfoId;


    public Integer getTDepartinfoId() {
        return tDepartinfoId;
    }

    public void setTDepartinfoId(Integer tDepartinfoId) {
        this.tDepartinfoId = tDepartinfoId;
    }

    public String getTDepartinfoName() {
        return tDepartinfoName;
    }

    public void setTDepartinfoName(String tDepartinfoName) {
        this.tDepartinfoName = tDepartinfoName;
    }

    public Integer getTUserinfoId() {
        return tUserinfoId;
    }

    public void setTUserinfoId(Integer tUserinfoId) {
        this.tUserinfoId = tUserinfoId;
    }

    public Long getTDepartinfoTel() {
        return tDepartinfoTel;
    }

    public void setTDepartinfoTel(Long tDepartinfoTel) {
        this.tDepartinfoTel = tDepartinfoTel;
    }

    public Long getTDepartinfoMobiletel() {
        return tDepartinfoMobiletel;
    }

    public void setTDepartinfoMobiletel(Long tDepartinfoMobiletel) {
        this.tDepartinfoMobiletel = tDepartinfoMobiletel;
    }

    public Long getTDepartinfoFaxes() {
        return tDepartinfoFaxes;
    }

    public void setTDepartinfoFaxes(Long tDepartinfoFaxes) {
        this.tDepartinfoFaxes = tDepartinfoFaxes;
    }

    public Integer getTBranchinfoId() {
        return tBranchinfoId;
    }

    public void setTBranchinfoId(Integer tBranchinfoId) {
        this.tBranchinfoId = tBranchinfoId;
    }

}