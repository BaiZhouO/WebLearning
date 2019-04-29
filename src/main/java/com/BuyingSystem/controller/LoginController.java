package com.BuyingSystem.controller;

import com.BuyingSystem.common.CartResult;
import com.BuyingSystem.common.ReturnCodes.CommonReturnCode;
import com.BuyingSystem.common.ReturnCodes.LoginReturnCode;
import com.BuyingSystem.common.WebResult;
import com.BuyingSystem.model.Customer;
import com.BuyingSystem.model.Product;
import com.BuyingSystem.model.Staff;
import com.BuyingSystem.service.CustomerService;
import com.BuyingSystem.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private CustomerService customerService; //寻找被声明为“service”的类注入

    @Autowired
    private StaffService staffService;
    //private HttpSession session;

    @GetMapping(value = "/login")
    public String getLoginPage(Model model)
    {
        return "/login/login";
    }

    @GetMapping(value = "/logout")
    @ResponseBody
    public Object logout(Model model, HttpSession session)
    {
        Customer customer = (Customer)session.getAttribute("currentCustomer");
        Staff staff = (Staff)session.getAttribute("currentStaff");
        Product product = (Product)session.getAttribute("currentProduct");
        CartResult cartResult = (CartResult)session.getAttribute("cartResult");
        if(customer != null)
        {
            session.removeAttribute("currentCustomer");

        }
        if(staff != null)
        {
            session.removeAttribute("currentStaff");
        }
        if(product!= null)
        {
            session.removeAttribute("currentProduct");
        }
        if(cartResult != null)
        {
            cartResult.setProductNumberInTotal("0");
            cartResult.setProductPriceInTotal("0");
            session.setAttribute("cartResult",cartResult);
        }
        return new WebResult(CommonReturnCode.SUCCESS);
    }

    @PostMapping(value = "/login")
    @ResponseBody
    public Object login(@RequestParam(required = false, value = "loginName")String loginName,
                        @RequestParam(required = false, value = "loginPassword")String loginPassword,
                        @RequestParam(required = false, value = "character")String character,
                        HttpSession session)
    {
        if(Integer.parseInt(character)==1)  //选择顾客
        {
            Customer customer = customerService.selectCustomerByName(loginName);

            if(customer == null)
            {
                return new WebResult(LoginReturnCode.USER_NOT_EXIST);
            }
            else
            {
                if(customer.getLoginPassword().equals(loginPassword))
                {
                    session.setAttribute("currentCustomer",customer);
                    return new WebResult(CommonReturnCode.SUCCESS);
                }
                else
                {
                    return new WebResult(LoginReturnCode.WRONG_PASSWORD);
                }
            }
        }
        else
        {
            Staff staff = staffService.selectStaffByName(loginName);
            if(staff == null)
            {
                return new WebResult(LoginReturnCode.USER_NOT_EXIST);
            }
            else
            {
                if(staff.getLoginPassword().equals(loginPassword))
                {
                    session.setAttribute("currentStaff",staff);
                    return new WebResult(CommonReturnCode.SUCCESS);
                }
                else
                {
                    return new WebResult(LoginReturnCode.WRONG_PASSWORD);
                }
            }
        }


    }

}
