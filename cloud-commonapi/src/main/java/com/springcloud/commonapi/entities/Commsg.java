package com.springcloud.commonapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (Commsg)实体类
 *
 * @author makejava
 * @since 2020-07-01 06:56:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Commsg implements Serializable {
    private static final long serialVersionUID = -30019785555079595L;
    /**
    * 编号
    */
    private Integer cno;
    /**
    * 商品名
    */
    private String cname;
    /**
    * 厂家
    */
    private String ccompany;
    /**
    * 时间
    */
    private Date ctime;
    /**
    * 销售部门
    */
    private String cclass;
    /**
    * 库存信息
    */
    private Integer snumber;


}