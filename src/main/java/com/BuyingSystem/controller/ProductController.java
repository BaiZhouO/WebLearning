package com.BuyingSystem.controller;

import com.BuyingSystem.common.ReturnCodes.CommonReturnCode;
import com.BuyingSystem.common.ReturnCodes.ProductReturnCode;
import com.BuyingSystem.common.WebResult;
import com.BuyingSystem.model.Product;
import com.BuyingSystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "viewDetails")
    public String viewDetails(Model model){
        return "/viewDetails/viewDetails";
    }

    @GetMapping(value = "viewDetailsForStaff")
    public String viewDetailsForStaff(Model model){
        return "/viewDetails/viewDetailsForStaff";
    }

    @GetMapping(value = "/addProductPage")
    public String addProductPage(Model model)
    {
        return "/addProductPage/addProductPage";
    }
    @GetMapping(value = "/modifyProduct")
    public String modifyProduct(Model model)
    {
        return "/addProductPage/modifyProduct";
    }

    @PostMapping(value = "viewDetails")
    @ResponseBody
    public Object showProductMsg(@RequestParam("sequenceNumber")int sequenceNumber,
                                 HttpSession session)
    {
        Product product = productService.selectProductById(sequenceNumber);

        if(product != null)
        {
            session.setAttribute("currentProduct",product);
            return new WebResult(CommonReturnCode.SUCCESS);
        }
        else
        {
            return new WebResult(ProductReturnCode.PRODUCT_NOT_FOUND);
        }
    }

    @PostMapping(value = "/viewDetailsForStaff")
    @ResponseBody
    public Object showProductMsgForStaff(@RequestParam("sequenceNumber")int sequenceNumber,
                                 HttpSession session)
    {
        Product product = productService.selectProductById(sequenceNumber);

        if(product != null)
        {
            session.setAttribute("currentProduct",product);
            return new WebResult(CommonReturnCode.SUCCESS);
        }
        else
        {
            return new WebResult(ProductReturnCode.PRODUCT_NOT_FOUND);
        }
    }

    @PostMapping(value = "/addProductToDB")
    @ResponseBody
    public Object addProductToDB(@RequestParam("prod_name")String prod_name,
                                 @RequestParam("prod_price")String prod_price,
                                 @RequestParam("prod_description")String prod_description,
                                 @RequestParam("prod_pic_dir")String prod_pic_dir)
    {
        Product product = new Product();

        product.setProd_name(prod_name);
        product.setProd_price(Double.parseDouble(prod_price));
        product.setProd_description(prod_description);
        product.setProd_pic_dir(prod_pic_dir);

        productService.insertProduct(product);
        return new WebResult(CommonReturnCode.SUCCESS);
    }


    @PostMapping(value = "/modify")
    @ResponseBody
    public Object modifyProduct(@RequestParam("prod_price")String prod_price,
                                 @RequestParam("prod_description")String prod_description,
                                 HttpSession session)
    {
        Product product = (Product)session.getAttribute("currentProduct");

        Product newProduct = new Product();
        newProduct.setProd_name(product.getProd_name());
        newProduct.setProd_price(Double.parseDouble(prod_price));
        newProduct.setProd_description(prod_description);
        newProduct.setProd_pic_dir(product.getProd_pic_dir());
        newProduct.setProd_id(product.getProd_id());

        productService.updateProduct(newProduct);
        session.setAttribute("currentProduct",newProduct);
        return new WebResult(CommonReturnCode.SUCCESS);
    }

    @PostMapping(value = "/deleteProduct")
    @ResponseBody
    public Object deleteProduct(HttpSession session)
    {
        Product currentProduct = (Product)session.getAttribute("currentProduct");
        productService.deleteProduct(currentProduct.getProd_id());

        return new WebResult(CommonReturnCode.SUCCESS);
    }
}
