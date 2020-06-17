package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (Costinfo)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:20
 */
public class Costinfo implements Serializable {
    private static final long serialVersionUID = 668128665668670095L;
    /**
    * 客户编号
    */
    private Integer costinfoid;
    /**
    * 客户姓名
    */
    private String costinfoname;
    /**
    * 客户地址
    */
    private String costinfoaddress;
    /**
    * 客户联想方式
    */
    private String costinfophone;


    public Integer getCostinfoid() {
        return costinfoid;
    }

    public void setCostinfoid(Integer costinfoid) {
        this.costinfoid = costinfoid;
    }

    public String getCostinfoname() {
        return costinfoname;
    }

    public void setCostinfoname(String costinfoname) {
        this.costinfoname = costinfoname;
    }

    public String getCostinfoaddress() {
        return costinfoaddress;
    }

    public void setCostinfoaddress(String costinfoaddress) {
        this.costinfoaddress = costinfoaddress;
    }

    public String getCostinfophone() {
        return costinfophone;
    }

    public void setCostinfophone(String costinfophone) {
        this.costinfophone = costinfophone;
    }

}