package com.springcloud.commonapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (Affair)实体类
 *
 * @author makejava
 * @since 2020-06-30 01:34:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Affair implements Serializable {
    private static final long serialVersionUID = -26263587960652643L;
    /**
    * 事务id
    */
    private Integer id;
    /**
    * 事务名称
    */
    private String name;
    /**
    * 开始时间
    */
    private Date createdate;
    /**
    * 结束时间
    */
    private Date enddate;
    /**
    * 文件上传路劲
    */
    private String url;
    /**
    * 事务描述
    */
    private String detail;
    /**
    * 事务创建者id
    */
    private Integer cid;


}