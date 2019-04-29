package com.BuyingSystem.model;

public class Product {

    private int prod_id;
    private String prod_name;
    private double prod_price;
    private String prod_description;
    private String prod_pic_dir;

    public int getProd_id() {
        return prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public double getProd_price() {
        return prod_price;
    }

    public String getProd_description() {
        return prod_description;
    }

    public String getProd_pic_dir() {
        return prod_pic_dir;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public void setProd_price(double prod_price) {
        this.prod_price = prod_price;
    }

    public void setProd_description(String prod_description) {
        this.prod_description = prod_description;
    }


    public void setProd_pic_dir(String prod_pic_dir) {
        this.prod_pic_dir = prod_pic_dir;
    }
}
