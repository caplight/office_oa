package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (TAccessoryfile)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:11
 */
public class TAccessoryfile implements Serializable {
    private static final long serialVersionUID = -27424159274529535L;
    
    private Integer tAccessoryfileId;
    
    private Integer tFileinfoId;
    
    private String tAccessoryfileName;
    
    private Integer tAccessoryfileSize;
    
    private Integer tFileinfoFiletypeid;
    
    private Date tAccessoryfileCreatedate;
    
    private String tAccessoryfilePath;


    public Integer getTAccessoryfileId() {
        return tAccessoryfileId;
    }

    public void setTAccessoryfileId(Integer tAccessoryfileId) {
        this.tAccessoryfileId = tAccessoryfileId;
    }

    public Integer getTFileinfoId() {
        return tFileinfoId;
    }

    public void setTFileinfoId(Integer tFileinfoId) {
        this.tFileinfoId = tFileinfoId;
    }

    public String getTAccessoryfileName() {
        return tAccessoryfileName;
    }

    public void setTAccessoryfileName(String tAccessoryfileName) {
        this.tAccessoryfileName = tAccessoryfileName;
    }

    public Integer getTAccessoryfileSize() {
        return tAccessoryfileSize;
    }

    public void setTAccessoryfileSize(Integer tAccessoryfileSize) {
        this.tAccessoryfileSize = tAccessoryfileSize;
    }

    public Integer getTFileinfoFiletypeid() {
        return tFileinfoFiletypeid;
    }

    public void setTFileinfoFiletypeid(Integer tFileinfoFiletypeid) {
        this.tFileinfoFiletypeid = tFileinfoFiletypeid;
    }

    public Date getTAccessoryfileCreatedate() {
        return tAccessoryfileCreatedate;
    }

    public void setTAccessoryfileCreatedate(Date tAccessoryfileCreatedate) {
        this.tAccessoryfileCreatedate = tAccessoryfileCreatedate;
    }

    public String getTAccessoryfilePath() {
        return tAccessoryfilePath;
    }

    public void setTAccessoryfilePath(String tAccessoryfilePath) {
        this.tAccessoryfilePath = tAccessoryfilePath;
    }

}