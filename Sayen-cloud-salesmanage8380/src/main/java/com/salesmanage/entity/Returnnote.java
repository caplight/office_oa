package com.salesmanage.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Returnnote)实体类
 *
 * @author Sayen
 * @since 2020-06-26 11:49:33
 */
public class Returnnote implements Serializable {
    private static final long serialVersionUID = 450721316970736602L;

    private String returnId;
    private Integer ordernumber;
    private Date saledate;
    private String goods;
    private String rAmount;
    private Double price;
    private Double discount;
    private Double rSum;
    private Date returndate;


    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
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

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getRAmount() {
        return rAmount;
    }

    public void setRAmount(String rAmount) {
        this.rAmount = rAmount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getRSum() {
        return rSum;
    }

    public void setRSum(Double rSum) {
        this.rSum = rSum;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

}