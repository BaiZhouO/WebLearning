package com.BuyingSystem.common.vo;

import com.BuyingSystem.model.Order;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

public class OrderVO extends Order {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_id",type = IdType.AUTO)
    private int order_id;

    @TableField("cus_id")
    private int cus_id;

    @TableField("prod_id")
    private String prod_id;

    @TableField("prod_count")
    private int prod_count;

    @TableField("price")
    private double price;

    @TableField("status")
    private String status;

    @TableField("submit_date")
    private Date submit_date;

    @TableField("handle_date")
    private Date handle_date;

    @TableField("sendAddress")
    private String sendAddress;

    @Override
    public int getOrder_id() {
        return order_id;
    }

    @Override
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    @Override
    public int getCus_id() {
        return cus_id;
    }

    @Override
    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    @Override
    public String getProd_id() {
        return prod_id;
    }

    @Override
    public void setProd_id(String prod_id) {
        this.prod_id = prod_id;
    }

    @Override
    public int getProd_count() {
        return prod_count;
    }

    @Override
    public void setProd_count(int prod_count) {
        this.prod_count = prod_count;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public Date getSubmit_date() {
        return submit_date;
    }

    @Override
    public void setSubmit_date(Date submit_date) {
        this.submit_date = submit_date;
    }

    @Override
    public Date getHandle_date() {
        return handle_date;
    }

    @Override
    public void setHandle_date(Date handle_date) {
        this.handle_date = handle_date;
    }

    @Override
    public String getSendAddress() {
        return sendAddress;
    }

    @Override
    public void setSendAddress(String sendAddress) {
        this.sendAddress = sendAddress;
    }


}
