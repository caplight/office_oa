package com.salesmanage.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Salesnote)实体类
 *
 * @author makejava
 * @since 2020-06-26 11:49:12
 */
public class Salesnote implements Serializable {
    private static final long serialVersionUID = -31184933186330683L;
    /**
    * 销售单编号
    */
    private String salesid;
    /**
    * 客户编号
    */
    private Integer clientid;
    /**
    * 订单号
    */
    private Integer ordernumber;
    /**
    * 销售日期
    */
    private Date saledate;
    /**
    * 业务员
    */
    private String salesman;
    /**
    * 货品
    */
    private String goods;
    /**
    * 数量
    */
    private Integer amount;
    /**
    * 价格
    */
    private Double price;
    /**
    * 折扣
    */
    private String discount;
    /**
    * 总额
    */
    private String total;
    /**
    * 实收金额
    */
    private String sum;


    public String getSalesid() {
        return salesid;
    }

    public void setSalesid(String salesid) {
        this.salesid = salesid;
    }

    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public Integer getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(Integer ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Date getSaledate() {
        return saledate;
    }

    public void setSaledate(Date saledate) {
        this.saledate = saledate;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman = salesman;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

}