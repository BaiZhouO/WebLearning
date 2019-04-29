package com.BuyingSystem.service;

import com.BuyingSystem.model.Customer;

import java.util.List;

public interface CustomerService {

    void insertCustomer(Customer customer);

    void deleteCustomer(int id);

    void updateCustomer(Customer customer);

    Customer selectCustomerById(int cus_id);

    List<Customer> selectAll();

    Customer selectCustomerByName(String loginName);

    int selectCustomerCount();

}
