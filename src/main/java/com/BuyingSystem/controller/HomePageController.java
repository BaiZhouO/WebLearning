package com.BuyingSystem.controller;

import com.BuyingSystem.model.Product;
import com.BuyingSystem.service.CustomerService;
import com.BuyingSystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HomePageController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;

    private HttpSession session;

    @GetMapping(value = "home/view")
    public String homepage(Model model,HttpSession session)
    {
        List<Product> products = productService.selectAll();
        session.setAttribute("products",products);
        return "home/homepage";
    }

    @GetMapping(value = "home/staffView")
    public String homepageForStaff(Model model,HttpSession session)
    {
        List<Product> products = productService.selectAll();
        session.setAttribute("products",products);
        if(session.getAttribute("currentStaff") == null)
        {
            return "login/login";
        }
        return "home/homepageForStaff";
    }
}
