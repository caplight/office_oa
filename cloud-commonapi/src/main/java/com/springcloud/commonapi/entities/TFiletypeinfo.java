package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (TFiletypeinfo)实体类
 *
 * @author makejava
 * @since 2020-06-06 10:18:19
 */
public class TFiletypeinfo implements Serializable {
    private static final long serialVersionUID = -41624805037692389L;
    
    private Integer tFileinfoFiletypeid;
    
    private String tFiletypeinfoName;
    
    private String tFiletypeinfoImage;
    
    private String tFiletypeinfoSuffix;


    public Integer getTFileinfoFiletypeid() {
        return tFileinfoFiletypeid;
    }

    public void setTFileinfoFiletypeid(Integer tFileinfoFiletypeid) {
        this.tFileinfoFiletypeid = tFileinfoFiletypeid;
    }

    public String getTFiletypeinfoName() {
        return tFiletypeinfoName;
    }

    public void setTFiletypeinfoName(String tFiletypeinfoName) {
        this.tFiletypeinfoName = tFiletypeinfoName;
    }

    public String getTFiletypeinfoImage() {
        return tFiletypeinfoImage;
    }

    public void setTFiletypeinfoImage(String tFiletypeinfoImage) {
        this.tFiletypeinfoImage = tFiletypeinfoImage;
    }

    public String getTFiletypeinfoSuffix() {
        return tFiletypeinfoSuffix;
    }

    public void setTFiletypeinfoSuffix(String tFiletypeinfoSuffix) {
        this.tFiletypeinfoSuffix = tFiletypeinfoSuffix;
    }

}