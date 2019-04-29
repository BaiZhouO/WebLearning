package com.BuyingSystem.controller;


import com.BuyingSystem.common.ReturnCodes.CommonReturnCode;
import com.BuyingSystem.common.ReturnCodes.RegisterReturnCode;
import com.BuyingSystem.common.WebResult;
import com.BuyingSystem.model.Customer;
import com.BuyingSystem.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.Date;

@Controller
public class RegisterController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/registerPage")
    public String getRegisterPage(Model model)
    {
        return "register/register";
    }

    @PostMapping(value = "/register")
    @ResponseBody
    public Object register(@RequestParam("loginName")String loginName,
                           @RequestParam("loginPassword")String loginPassword,
                           @RequestParam("cus_name")String cus_name,
                           @RequestParam("cus_phone")String cus_phone,
                           @RequestParam("cus_address")String cus_address,
                           @RequestParam("sex")String sex,
                           @RequestParam("Email")String Email)
    {
        Date GMTtime = new Date();

        Customer customer = new Customer();

        customer.setLoginName(loginName);
        customer.setLoginPassword(loginPassword);
        customer.setCus_name(cus_name);
        customer.setCus_phone(cus_phone);
        customer.setCus_address(cus_address);
        customer.setSex(sex);
        customer.setEmail(Email);
        customer.setRegisterTime(GMTtime);

        try
        {
            customerService.insertCustomer(customer);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return new WebResult(RegisterReturnCode.ADDTO_DATABASE_FAILED);
        }

        return new WebResult(CommonReturnCode.SUCCESS);
    }
}
