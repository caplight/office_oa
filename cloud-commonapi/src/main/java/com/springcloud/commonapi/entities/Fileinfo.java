package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (Fileinfo)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:20
 */
public class Fileinfo implements Serializable {
    private static final long serialVersionUID = -37911601799341555L;
    
    private Integer fileinfoid;
    
    private String fileinfoname;
    
    private Integer fileinfofiletypeid;
    
    private String fileinforemark;
    
    private String fileinfoowner;
    
    private Date fileinfocreatedate;
    
    private Integer fileinfoparentid;
    
    private String fileinfofilepath;
    
    private Integer fileinfoifdelete;


    public Integer getFileinfoid() {
        return fileinfoid;
    }

    public void setFileinfoid(Integer fileinfoid) {
        this.fileinfoid = fileinfoid;
    }

    public String getFileinfoname() {
        return fileinfoname;
    }

    public void setFileinfoname(String fileinfoname) {
        this.fileinfoname = fileinfoname;
    }

    public Integer getFileinfofiletypeid() {
        return fileinfofiletypeid;
    }

    public void setFileinfofiletypeid(Integer fileinfofiletypeid) {
        this.fileinfofiletypeid = fileinfofiletypeid;
    }

    public String getFileinforemark() {
        return fileinforemark;
    }

    public void setFileinforemark(String fileinforemark) {
        this.fileinforemark = fileinforemark;
    }

    public String getFileinfoowner() {
        return fileinfoowner;
    }

    public void setFileinfoowner(String fileinfoowner) {
        this.fileinfoowner = fileinfoowner;
    }

    public Date getFileinfocreatedate() {
        return fileinfocreatedate;
    }

    public void setFileinfocreatedate(Date fileinfocreatedate) {
        this.fileinfocreatedate = fileinfocreatedate;
    }

    public Integer getFileinfoparentid() {
        return fileinfoparentid;
    }

    public void setFileinfoparentid(Integer fileinfoparentid) {
        this.fileinfoparentid = fileinfoparentid;
    }

    public String getFileinfofilepath() {
        return fileinfofilepath;
    }

    public void setFileinfofilepath(String fileinfofilepath) {
        this.fileinfofilepath = fileinfofilepath;
    }

    public Integer getFileinfoifdelete() {
        return fileinfoifdelete;
    }

    public void setFileinfoifdelete(Integer fileinfoifdelete) {
        this.fileinfoifdelete = fileinfoifdelete;
    }

}