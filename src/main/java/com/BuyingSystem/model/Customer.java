package com.BuyingSystem.model;

import java.util.Date;

public class Customer {

    private int cus_id;
    private String loginName;
    private String loginPassword;
    private String cus_name;
    private String cus_phone;
    private String cus_address;
    private String sex;
    private String email;
    private Date RegisterTime;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCus_id() {
        return cus_id;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public String getCus_name() {
        return cus_name;

    }

    public String getCus_phone() {
        return cus_phone;
    }

    public String getCus_address() {
        return cus_address;
    }

    public String getSex() {
        return sex;
    }



    public Date getRegisterTime() {
        return RegisterTime;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public void setCus_phone(String cus_phone) {
        this.cus_phone = cus_phone;
    }

    public void setCus_address(String cus_address) {
        this.cus_address = cus_address;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



    public void setRegisterTime(Date registerTime) {
        RegisterTime = registerTime;
    }
}
