package com.BuyingSystem.controller;

import com.BuyingSystem.common.CartResult;
import com.BuyingSystem.common.PageInfo;
import com.BuyingSystem.common.ReturnCodes.CommonReturnCode;
import com.BuyingSystem.common.ReturnCodes.OrderReturnCode;
import com.BuyingSystem.common.WebPageResult;
import com.BuyingSystem.common.WebResult;
import com.BuyingSystem.common.dto.OrderPageDTO;
import com.BuyingSystem.model.Cart;
import com.BuyingSystem.model.Customer;
import com.BuyingSystem.model.Order;
import com.BuyingSystem.service.OrderCartService;
import com.BuyingSystem.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderCartService orderCartService;


    @GetMapping(value = "/showOrder/view")
    public String showOrder(Model model){
        return "/showOrder/showOrder";
    }


    @GetMapping(value = "/showOrderForStaff/viewForStaff")
    public String showOrderForStaff(Model model){
        return "showOrderForStaff/showOrderForStaff";
    }

    @GetMapping(value = "/showOrder/")
    @ResponseBody
    public Object listOrderForCustomer(PageInfo pageInfo,
                                       @RequestParam(required = false,value = "search")String search,
                                       HttpSession session)
    {
        Customer currentCustomer = (Customer)session.getAttribute("currentCustomer");
        int cus_id = currentCustomer.getCus_id();
        OrderPageDTO orderPageDTO = orderService.listByCusId(pageInfo,search,cus_id);

        return new WebPageResult(orderPageDTO.getOrderVOs(),orderPageDTO.getPageInfo().getTotal());
    }

    @GetMapping(value = "/showOrderForStaff/")
    @ResponseBody
    public Object listOrderForStaff(PageInfo pageInfo,
                                       @RequestParam(required = false,value = "search")String search,
                                       HttpSession session)
    {

        OrderPageDTO orderPageDTO = orderService.listByPage(pageInfo,search);

        return new WebPageResult(orderPageDTO.getOrderVOs(),orderPageDTO.getPageInfo().getTotal());
    }


    @PostMapping(value = "/addToOrder")
    @ResponseBody
    public Object addToOrder(HttpSession session)
    {
        Customer currentCustomer = (Customer)session.getAttribute("currentCustomer");
        if(currentCustomer == null)
        {
            return new WebResult(OrderReturnCode.NOT_A_CUSTOMER);
        }

        CartResult cartResult = (CartResult)session.getAttribute("cartResult") ;
        Order order = new Order();




        int cus_id = currentCustomer.getCus_id();

        String sendAddress = currentCustomer.getCus_address();

        int prod_count = Integer.parseInt(cartResult.getProductNumberInTotal());
        double price = Double.parseDouble(cartResult.getProductPriceInTotal());

        try
        {
            orderCartService.findRecords();   //截获异常

            order.setCus_id(cus_id);
            order.setSendAddress(sendAddress);



            String prod_ids = "";
            List<Cart> cartList = orderCartService.selectAll();

            for(int i=0;i<cartList.size();i++)
            {
                Cart cartRecord = cartList.get(i);
                if(i<cartList.size()-1)
                {
                    prod_ids += cartRecord.getProduct_prod_id()+" and ";
                }
                else
                {
                    prod_ids += cartRecord.getProduct_prod_id();
                }
            }

            Date submit_date = new Date();
            Date handle_date = null;

            order.setProd_id(prod_ids);

            order.setProd_count(prod_count);
            order.setPrice(price);
            order.setSubmit_date(submit_date);
            order.setStatus("not_handled");
            order.setHandle_date(handle_date);

            orderService.insertOrder(order);

            return new WebResult(CommonReturnCode.SUCCESS);

        }catch (Exception e)
        {
            return new WebResult(OrderReturnCode.EMPTY_CART);
        }
    }

    @PostMapping(value ="/updateOrder")
    @ResponseBody
    public Object updateOrder(@Param("newValue")String newValue,
                              @Param("order_id")String order_id,
                              HttpSession session)
    {
        Order orderneedModifying = orderService.selectOrderById(Integer.parseInt(order_id));

        Order newOrder = new Order();

        newOrder.setOrder_id(orderneedModifying.getOrder_id());
        newOrder.setHandle_date(new Date());
        newOrder.setStatus(newValue);
        newOrder.setSubmit_date(orderneedModifying.getSubmit_date());
        newOrder.setPrice(orderneedModifying.getPrice());
        newOrder.setProd_count(orderneedModifying.getProd_count());
        newOrder.setSendAddress(orderneedModifying.getSendAddress());
        newOrder.setCus_id(orderneedModifying.getCus_id());
        newOrder.setProd_id(orderneedModifying.getProd_id());

        orderService.updateOrder(newOrder);

        return new WebResult(CommonReturnCode.SUCCESS);
    }
}

