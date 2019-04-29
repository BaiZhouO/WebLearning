package com.BuyingSystem.service.impl;
import com.BuyingSystem.dao.CustomerDao;
import com.BuyingSystem.model.Customer;
import com.BuyingSystem.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("CustomerService") //声明以下类作为service注入
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerDao customerDao; //dao层处理类，寻找合适（按名字）的bean注入

    public void insertCustomer(Customer customer){
        customerDao.insertCustomer(customer);
    }

    public void deleteCustomer(int id)
    {
        customerDao.deleteCustomer(id);
    }

    public void updateCustomer(Customer customer)
    {
        customerDao.updateCustomer(customer);
    }

    public Customer selectCustomerById(int cus_id)
    {
        return customerDao.selectCustomerById(cus_id);
    }

    public List<Customer> selectAll()
    {
        return customerDao.selectAll();
    }

    public Customer selectCustomerByName(String loginName)
    {
        return customerDao.selectCustomerByName(loginName);
    }

    public int selectCustomerCount()
    {
        return customerDao.selectCustomerCount();
    }

}
