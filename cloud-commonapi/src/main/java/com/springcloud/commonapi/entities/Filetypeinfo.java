package com.springcloud.commonapi.entities;

import java.io.Serializable;

/**
 * (Filetypeinfo)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:20
 */
public class Filetypeinfo implements Serializable {
    private static final long serialVersionUID = 965287924101900042L;
    
    private Integer fileinfofiletypeid;
    
    private String filetypeinfoname;
    
    private String filetypeinfoimage;
    
    private String filetypeinfosuffix;


    public Integer getFileinfofiletypeid() {
        return fileinfofiletypeid;
    }

    public void setFileinfofiletypeid(Integer fileinfofiletypeid) {
        this.fileinfofiletypeid = fileinfofiletypeid;
    }

    public String getFiletypeinfoname() {
        return filetypeinfoname;
    }

    public void setFiletypeinfoname(String filetypeinfoname) {
        this.filetypeinfoname = filetypeinfoname;
    }

    public String getFiletypeinfoimage() {
        return filetypeinfoimage;
    }

    public void setFiletypeinfoimage(String filetypeinfoimage) {
        this.filetypeinfoimage = filetypeinfoimage;
    }

    public String getFiletypeinfosuffix() {
        return filetypeinfosuffix;
    }

    public void setFiletypeinfosuffix(String filetypeinfosuffix) {
        this.filetypeinfosuffix = filetypeinfosuffix;
    }

}