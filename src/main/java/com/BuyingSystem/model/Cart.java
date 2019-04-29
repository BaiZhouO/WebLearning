package com.BuyingSystem.model;

public class Cart {

    private String Product_prod_id;
    private String prod_name;
    private double total_price;
    private int total_count;
    private int cus_id;

    public String getProduct_prod_id() {
        return Product_prod_id;
    }

    public void setProduct_prod_id(String product_prod_id) {
        Product_prod_id = product_prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public int getCus_id() {
        return cus_id;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }
}
