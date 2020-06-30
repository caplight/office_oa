package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (Costrela)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:20
 */
public class Costrela implements Serializable {
    private static final long serialVersionUID = 511865101332134010L;
    /**
    * 客户编号
    */
    private Integer costrelacostid;
    /**
    * 负责人编号
    */
    private Integer costrelauserid;


    public Integer getCostrelacostid() {
        return costrelacostid;
    }

    public void setCostrelacostid(Integer costrelacostid) {
        this.costrelacostid = costrelacostid;
    }

    public Integer getCostrelauserid() {
        return costrelauserid;
    }

    public void setCostrelauserid(Integer costrelauserid) {
        this.costrelauserid = costrelauserid;
    }

}