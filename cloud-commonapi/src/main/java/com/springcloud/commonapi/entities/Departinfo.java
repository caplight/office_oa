package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (Departinfo)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:20
 */
public class Departinfo implements Serializable {
    private static final long serialVersionUID = -10865259509188273L;
    
    private Integer departinfoid;
    
    private String departinfoname;
    
    private Long userinfoid;
    
    private Long departinfotel;
    
    private Long departinfomobiletel;
    
    private Long departinfofaxes;
    
    private Integer branchinfoid;


    public Integer getDepartinfoid() {
        return departinfoid;
    }

    public void setDepartinfoid(Integer departinfoid) {
        this.departinfoid = departinfoid;
    }

    public String getDepartinfoname() {
        return departinfoname;
    }

    public void setDepartinfoname(String departinfoname) {
        this.departinfoname = departinfoname;
    }

    public Long getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(Long userinfoid) {
        this.userinfoid = userinfoid;
    }

    public Long getDepartinfotel() {
        return departinfotel;
    }

    public void setDepartinfotel(Long departinfotel) {
        this.departinfotel = departinfotel;
    }

    public Long getDepartinfomobiletel() {
        return departinfomobiletel;
    }

    public void setDepartinfomobiletel(Long departinfomobiletel) {
        this.departinfomobiletel = departinfomobiletel;
    }

    public Long getDepartinfofaxes() {
        return departinfofaxes;
    }

    public void setDepartinfofaxes(Long departinfofaxes) {
        this.departinfofaxes = departinfofaxes;
    }

    public Integer getBranchinfoid() {
        return branchinfoid;
    }

    public void setBranchinfoid(Integer branchinfoid) {
        this.branchinfoid = branchinfoid;
    }

}