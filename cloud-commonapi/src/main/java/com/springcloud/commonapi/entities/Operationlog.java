package com.springcloud.commonapi.entities;

import java.util.Date;
import java.io.Serializable;

/**
 * (Operationlog)实体类
 *
 * @author makejava
 * @since 2020-06-16 14:37:20
 */
public class Operationlog implements Serializable {
    private static final long serialVersionUID = -30945245790651309L;
    
    private Integer operationlogid;
    
    private String operationlogname;
    
    private String operationlogusername;
    
    private Date operationlogtime;
    
    private String operationlogcontent;


    public Integer getOperationlogid() {
        return operationlogid;
    }

    public void setOperationlogid(Integer operationlogid) {
        this.operationlogid = operationlogid;
    }

    public String getOperationlogname() {
        return operationlogname;
    }

    public void setOperationlogname(String operationlogname) {
        this.operationlogname = operationlogname;
    }

    public String getOperationlogusername() {
        return operationlogusername;
    }

    public void setOperationlogusername(String operationlogusername) {
        this.operationlogusername = operationlogusername;
    }

    public Date getOperationlogtime() {
        return operationlogtime;
    }

    public void setOperationlogtime(Date operationlogtime) {
        this.operationlogtime = operationlogtime;
    }

    public String getOperationlogcontent() {
        return operationlogcontent;
    }

    public void setOperationlogcontent(String operationlogcontent) {
        this.operationlogcontent = operationlogcontent;
    }

}