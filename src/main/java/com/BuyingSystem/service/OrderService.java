package com.BuyingSystem.service;

import com.BuyingSystem.common.PageInfo;
import com.BuyingSystem.common.dto.OrderPageDTO;
import com.BuyingSystem.model.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {

    void insertOrder(Order order);

    void deleteOrder(int order_id);

    void updateOrder(Order order);

    Order selectOrderById(int order_id);

    List<Order> selectAll();

    Order selectOrderByName(String prod_name);

    int selectOrderCount();

    OrderPageDTO listByCusId(PageInfo pageInfo, String search, int cus_id);

    OrderPageDTO listByPage(PageInfo pageInfo, String search);
}
