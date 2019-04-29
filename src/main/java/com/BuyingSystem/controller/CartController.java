package com.BuyingSystem.controller;
import com.BuyingSystem.common.CartResult;
import com.BuyingSystem.common.PageInfo;
import com.BuyingSystem.common.ReturnCodes.CommonReturnCode;
import com.BuyingSystem.common.ReturnCodes.OrderReturnCode;
import com.BuyingSystem.common.ReturnCodes.ProductReturnCode;
import com.BuyingSystem.common.WebPageResult;
import com.BuyingSystem.common.WebResult;
import com.BuyingSystem.common.dto.CartPageDTO;
import com.BuyingSystem.model.Cart;
import com.BuyingSystem.model.Customer;
import com.BuyingSystem.model.Product;
import com.BuyingSystem.service.OrderCartService;
import com.BuyingSystem.service.ProductService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class CartController {

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderCartService orderCartService;

    @GetMapping(value = "/showCart/view")
    public String showCart(Model model){return "/showCart/showCart";}

    @GetMapping(value = "/showCart/")    //每次加载页面一定会先加载table
    @ResponseBody
    public Object listCart(PageInfo pageInfo,@RequestParam(required = false, value = "search")String search,
                           HttpSession session)
    {
        //搜索功能还没做好
        Customer currentCustomer = (Customer)session.getAttribute("currentCustomer");
        int cus_id = currentCustomer.getCus_id();

        CartPageDTO cartPageDTO = orderCartService.listByPage(pageInfo,search,cus_id);


        CartResult cartResult = new CartResult();

        cartResult.setProductNumberInTotal(String.valueOf(orderCartService.selectOrderCartCount()));
        cartResult.setProductPriceInTotal(String.valueOf(orderCartService.findFinalPrice()));

        session.setAttribute("cartResult",cartResult);

        return new WebPageResult(cartPageDTO.getCartVOs(),cartPageDTO.getPageInfo().getTotal());

    }


    @PostMapping(value = "/addToCart")
    @ResponseBody
    public Object addToCart(@RequestParam("Prod_count")int prod_count,
                            HttpSession session)
    {
        Product product = (Product) session.getAttribute("currentProduct");

        Customer currentCustomer = (Customer)session.getAttribute("currentCustomer");
        if(currentCustomer == null)
        {
            return new WebResult(OrderReturnCode.NOT_A_CUSTOMER);
        }

        int cus_id = currentCustomer.getCus_id();

        int product_prod_id = product.getProd_id();

        Cart oldCart = orderCartService.selectOrderCartByTwoIds(product_prod_id,cus_id);

        if(oldCart!=null )
        {
            Cart newCart = new Cart();
            newCart.setCus_id(cus_id);

            int newCount =  oldCart.getTotal_count()+prod_count;

            newCart.setTotal_count(newCount);
            newCart.setTotal_price(product.getProd_price()*newCount);
            newCart.setProd_name(product.getProd_name());
            newCart.setProduct_prod_id(String.valueOf(product.getProd_id()));

            orderCartService.updateOrderCartByTwoIds(newCart);
            return new WebResult(CommonReturnCode.SUCCESS);
        }

        Cart cart = new Cart();

        String prod_id = String.valueOf(product.getProd_id());

        cart.setProduct_prod_id(prod_id);
        cart.setProd_name(product.getProd_name());
        cart.setTotal_count(prod_count);
        cart.setCus_id(cus_id);

        double totalPrice = product.getProd_price()*prod_count;
        cart.setTotal_price(totalPrice);

        orderCartService.insertOrderCart(cart);
        return new WebResult(CommonReturnCode.SUCCESS);

    }

    @PostMapping(value = "/update")
    @ResponseBody
    public Object updateCart(@Param("newValue")String newValue,
                             @Param("prod_name")String prod_name,
                             HttpSession session)
    {
        Product productNeedModifying = productService.selectProductByName(prod_name);
        Customer currentCustomer = (Customer)session.getAttribute("currentCustomer");
        int cus_id = currentCustomer.getCus_id();

        Cart newCart = new Cart();

        String prod_id = String.valueOf(productNeedModifying.getProd_id());

        newCart.setProduct_prod_id(prod_id);
        newCart.setProd_name(productNeedModifying.getProd_name());
        newCart.setTotal_count(Integer.parseInt(newValue));
        newCart.setCus_id(cus_id);

        double newTotalPrice = productNeedModifying.getProd_price() * Integer.parseInt(newValue);

        newCart.setTotal_price(newTotalPrice);

        orderCartService.updateOrderCart(newCart);

        CartResult newCartResult = new CartResult();
        newCartResult.setProductNumberInTotal(String.valueOf(orderCartService.selectOrderCartCount()));
        newCartResult.setProductPriceInTotal(String.valueOf(orderCartService.findFinalPrice()));

        session.setAttribute("cartResult",newCartResult);


        return new WebResult(CommonReturnCode.SUCCESS);

    }

    @PostMapping(value = "/delete")
    @ResponseBody
    public Object deleteRecord(@Param("ids")String[] ids,HttpSession session)
    {
        for(int i=0;i<ids.length;i++)
        {

            orderCartService.deleteOrderCart(Integer.parseInt(ids[i]));
        }

        CartResult newCartResult = new CartResult();
        try
        {
            orderCartService.selectOrderCartCount();        //若数据表中无记录，则会报异常，此处为了截获异常

            newCartResult.setProductPriceInTotal(String.valueOf(orderCartService.findFinalPrice()));
            newCartResult.setProductNumberInTotal(String.valueOf(orderCartService.selectOrderCartCount()));
            session.setAttribute("cartResult",newCartResult);
            return new WebResult(CommonReturnCode.SUCCESS);
        }catch(Exception e)
        {
            newCartResult.setProductNumberInTotal(String.valueOf(0));
            newCartResult.setProductPriceInTotal(String.valueOf(0));
            session.setAttribute("cartResult",newCartResult);
            return new WebResult(CommonReturnCode.SUCCESS);
        }
    }
}
