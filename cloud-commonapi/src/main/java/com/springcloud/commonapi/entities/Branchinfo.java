package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (Branchinfo)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:20
 */
public class Branchinfo implements Serializable {
    private static final long serialVersionUID = 781030583744988169L;
    
    private Integer branchinfoid;
    
    private String branchinfoname;
    
    private String branchinfoshortname;


    public Integer getBranchinfoid() {
        return branchinfoid;
    }

    public void setBranchinfoid(Integer branchinfoid) {
        this.branchinfoid = branchinfoid;
    }

    public String getBranchinfoname() {
        return branchinfoname;
    }

    public void setBranchinfoname(String branchinfoname) {
        this.branchinfoname = branchinfoname;
    }

    public String getBranchinfoshortname() {
        return branchinfoshortname;
    }

    public void setBranchinfoshortname(String branchinfoshortname) {
        this.branchinfoshortname = branchinfoshortname;
    }

}