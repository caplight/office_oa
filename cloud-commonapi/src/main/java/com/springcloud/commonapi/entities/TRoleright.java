package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TRoleright)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TRoleright implements Serializable {
    private static final long serialVersionUID = 545216735935446037L;
    
    private Integer tRolerightId;
    
    private Integer tRoleinfoId;
    
    private String tRolerightUri;


    public Integer getTRolerightId() {
        return tRolerightId;
    }

    public void setTRolerightId(Integer tRolerightId) {
        this.tRolerightId = tRolerightId;
    }

    public Integer getTRoleinfoId() {
        return tRoleinfoId;
    }

    public void setTRoleinfoId(Integer tRoleinfoId) {
        this.tRoleinfoId = tRoleinfoId;
    }

    public String getTRolerightUri() {
        return tRolerightUri;
    }

    public void setTRolerightUri(String tRolerightUri) {
        this.tRolerightUri = tRolerightUri;
    }

}