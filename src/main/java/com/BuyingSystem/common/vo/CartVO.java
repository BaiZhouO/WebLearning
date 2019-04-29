package com.BuyingSystem.common.vo;

import com.BuyingSystem.model.Cart;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import com.baomidou.mybatisplus.annotations.TableField;

/**
 * VO（View Object）：视图对象，用于展示层，它的作用是把某个指定页面（或组件）的所有数据封装起来。
 */


public class CartVO extends Cart {

    private static final long serialVersionUID = 1L;

    @TableId(value = "Product_prod_id",type = IdType.AUTO)
    private String Product_prod_id;

    @TableField("prod_name")
    private String prod_name;

    @TableField("total_price")
    private double total_price;

    @TableField("total_count")
    private int total_count;

    @TableField("cus_id")
    private int cus_id;

    @Override
    public String getProduct_prod_id() {
        return Product_prod_id;
    }


    @Override
    public void setProduct_prod_id(String product_prod_id) {
        Product_prod_id = product_prod_id;
    }

    @Override
    public String getProd_name() {
        return prod_name;
    }

    @Override
    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    @Override
    public double getTotal_price() {
        return total_price;
    }

    @Override
    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    @Override
    public int getTotal_count() {
        return total_count;
    }

    @Override
    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    @Override
    public int getCus_id() {
        return cus_id;
    }

    @Override
    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }
}
