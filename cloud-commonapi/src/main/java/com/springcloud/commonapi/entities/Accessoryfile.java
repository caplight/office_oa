package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (Accessoryfile)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:18
 */
public class Accessoryfile implements Serializable {
    private static final long serialVersionUID = 403523298273723507L;
    
    private Integer accessoryfileid;
    
    private Integer fileinfoid;
    
    private String accessoryfilename;
    
    private Integer accessoryfilesize;
    
    private Integer fileinfofiletypeid;
    
    private Date accessoryfilecreatedate;
    
    private String accessoryfilepath;


    public Integer getAccessoryfileid() {
        return accessoryfileid;
    }

    public void setAccessoryfileid(Integer accessoryfileid) {
        this.accessoryfileid = accessoryfileid;
    }

    public Integer getFileinfoid() {
        return fileinfoid;
    }

    public void setFileinfoid(Integer fileinfoid) {
        this.fileinfoid = fileinfoid;
    }

    public String getAccessoryfilename() {
        return accessoryfilename;
    }

    public void setAccessoryfilename(String accessoryfilename) {
        this.accessoryfilename = accessoryfilename;
    }

    public Integer getAccessoryfilesize() {
        return accessoryfilesize;
    }

    public void setAccessoryfilesize(Integer accessoryfilesize) {
        this.accessoryfilesize = accessoryfilesize;
    }

    public Integer getFileinfofiletypeid() {
        return fileinfofiletypeid;
    }

    public void setFileinfofiletypeid(Integer fileinfofiletypeid) {
        this.fileinfofiletypeid = fileinfofiletypeid;
    }

    public Date getAccessoryfilecreatedate() {
        return accessoryfilecreatedate;
    }

    public void setAccessoryfilecreatedate(Date accessoryfilecreatedate) {
        this.accessoryfilecreatedate = accessoryfilecreatedate;
    }

    public String getAccessoryfilepath() {
        return accessoryfilepath;
    }

    public void setAccessoryfilepath(String accessoryfilepath) {
        this.accessoryfilepath = accessoryfilepath;
    }

}