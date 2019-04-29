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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class InfoController {
    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/info/viewPersonInfo/view")
    public String viewPersonInfo(Model model) {
        return "/info/viewPersonInfo";
    }

    @GetMapping(value = "/info/changePersonInfo/view")
    public String changePersonInfo(Model model) {
        return "/info/changePersonInfo";
    }

    @PostMapping(value = "/changeInfo")
    @ResponseBody
    public Object changeInfo(@RequestParam("cus_name")String cus_name,
                             @RequestParam("cus_phone")String cus_phone,
                             @RequestParam("cus_address")String cus_address,
                             @RequestParam("sex")String sex,
                             @RequestParam("Email")String Email,
                             HttpSession session)
    {
        Customer oldCustomer = (Customer) session.getAttribute("currentCustomer");

        Customer newCustomer = new Customer();

        newCustomer.setCus_id(oldCustomer.getCus_id());
        newCustomer.setLoginName(oldCustomer.getLoginName());
        newCustomer.setCus_name(cus_name);
        newCustomer.setCus_phone(cus_phone);
        newCustomer.setCus_address(cus_address);
        newCustomer.setSex(sex);
        newCustomer.setEmail(Email);
        newCustomer.setRegisterTime(oldCustomer.getRegisterTime());



        try
        {
            customerService.updateCustomer(newCustomer); //通过update的方式去修改现有的user
            session.setAttribute("currentCustomer",newCustomer);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return new WebResult(RegisterReturnCode.ADDTO_DATABASE_FAILED);
        }

        return new WebResult(CommonReturnCode.SUCCESS);
    }

}
