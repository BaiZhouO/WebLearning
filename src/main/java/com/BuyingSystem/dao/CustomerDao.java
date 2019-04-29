package com.BuyingSystem.dao;

import org.apache.ibatis.annotations.Param;
import com.BuyingSystem.model.Customer;
import java.util.List;


public interface CustomerDao {
    void insertCustomer(@Param("customer")Customer customer);

    void deleteCustomer(int id);

    void updateCustomer(@Param("customer_new")Customer customer);

    Customer selectCustomerById(int cus_id);

    List<Customer> selectAll();

    Customer selectCustomerByName(String loginName);

    int selectCustomerCount();
}
