package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (TFileinfo)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TFileinfo implements Serializable {
    private static final long serialVersionUID = 429108543008676457L;
    
    private Integer tFileinfoId;
    
    private String tFileinfoName;
    
    private Integer tFileinfoFiletypeid;
    
    private String tFileinfoRemark;
    
    private String tFileinfoOwner;
    
    private Date tFileinfoCreatedate;
    
    private Integer tFileinfoParentid;
    
    private String tFileinfoFilepath;
    
    private Integer tFileinfoIfdelete;


    public Integer getTFileinfoId() {
        return tFileinfoId;
    }

    public void setTFileinfoId(Integer tFileinfoId) {
        this.tFileinfoId = tFileinfoId;
    }

    public String getTFileinfoName() {
        return tFileinfoName;
    }

    public void setTFileinfoName(String tFileinfoName) {
        this.tFileinfoName = tFileinfoName;
    }

    public Integer getTFileinfoFiletypeid() {
        return tFileinfoFiletypeid;
    }

    public void setTFileinfoFiletypeid(Integer tFileinfoFiletypeid) {
        this.tFileinfoFiletypeid = tFileinfoFiletypeid;
    }

    public String getTFileinfoRemark() {
        return tFileinfoRemark;
    }

    public void setTFileinfoRemark(String tFileinfoRemark) {
        this.tFileinfoRemark = tFileinfoRemark;
    }

    public String getTFileinfoOwner() {
        return tFileinfoOwner;
    }

    public void setTFileinfoOwner(String tFileinfoOwner) {
        this.tFileinfoOwner = tFileinfoOwner;
    }

    public Date getTFileinfoCreatedate() {
        return tFileinfoCreatedate;
    }

    public void setTFileinfoCreatedate(Date tFileinfoCreatedate) {
        this.tFileinfoCreatedate = tFileinfoCreatedate;
    }

    public Integer getTFileinfoParentid() {
        return tFileinfoParentid;
    }

    public void setTFileinfoParentid(Integer tFileinfoParentid) {
        this.tFileinfoParentid = tFileinfoParentid;
    }

    public String getTFileinfoFilepath() {
        return tFileinfoFilepath;
    }

    public void setTFileinfoFilepath(String tFileinfoFilepath) {
        this.tFileinfoFilepath = tFileinfoFilepath;
    }

    public Integer getTFileinfoIfdelete() {
        return tFileinfoIfdelete;
    }

    public void setTFileinfoIfdelete(Integer tFileinfoIfdelete) {
        this.tFileinfoIfdelete = tFileinfoIfdelete;
    }

}