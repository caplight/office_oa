package com.springcloud.commonapi.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * (Sale)实体类
 *
 * @author makejava
 * @since 2020-06-27 16:14:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName("sale")
public class Sale implements Serializable {
    private static final long serialVersionUID = 766503679186770408L;
    /**
    * id
    */
    private Integer id;
    /**
    * 销售主题
    */
    private String theme;
    /**
    * 客户名称
    */
    private String cname;
    /**
    * 金额
    */
    private String money;
    /**
    * 需求
    */
    private String demand;
    /**
    * 最后联系
    */
    private Date date;
    /**
    * 负责人编号
    */
    private Integer cid;

}