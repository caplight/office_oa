package com.springcloud.commonapi.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * (Custinfo)实体类
 *
 * @author zhou
 * @since 2020-06-27 01:54:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("custinfo")
public class Custinfo implements Serializable {
    private static final long serialVersionUID = 797059072766392199L;
    /**
    * ID
    */
    private Integer id;
    /**
    * 客户姓名
    */
    private String name;
    /**
    * 客户地址
    */
    private String address;
    /**
    * 客户联想方式
    */
    private String phone;
    /**
    * 所属行业
    */
    private String industry;
    /**
    * 客户介绍
    */
    private String summary;
    /**
    * 负责人
    */
    private String ascription;

}