package com.BuyingSystem.service.impl;


import com.BuyingSystem.common.PageInfo;
import com.BuyingSystem.common.dto.OrderPageDTO;
import com.BuyingSystem.common.vo.OrderVO;
import com.BuyingSystem.dao.OrderDao;
import com.BuyingSystem.model.Order;
import com.BuyingSystem.service.OrderService;
import com.baomidou.mybatisplus.plugins.Page;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("OrderService")
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    public void insertOrder(Order order)
    {
        orderDao.insertOrder(order);
    }

    public void deleteOrder(int order_id)
    {
        orderDao.deleteOrder(order_id);
    }

    public void updateOrder(Order order)
    {
        orderDao.updateOrder(order);
    }

    public Order selectOrderById(int order_id)
    {
        return orderDao.selectOrderById(order_id);
    }

    public List<Order> selectAll()
    {
        return orderDao.selectAll();
    }

    public Order selectOrderByName(String prod_name)
    {
        return orderDao.selectOrderByName(prod_name);
    }

    public int selectOrderCount()
    {
        return orderDao.selectOrderCount();
    }


    public OrderPageDTO listByCusId(PageInfo pageInfo, String search, int cus_id)
    {
        Page<OrderVO> page = new Page<>(pageInfo.getCurrent(),pageInfo.getLimit());
        List<OrderVO> orderVOs = orderDao.listByCusId(pageInfo,search,cus_id,page);
        pageInfo.setTotal((int)page.getTotal());
        return new OrderPageDTO(orderVOs,pageInfo);
    }

    public OrderPageDTO listByPage(PageInfo pageInfo,String search)
    {
        Page<OrderVO> page = new Page<>(pageInfo.getCurrent(),pageInfo.getLimit());
        List<OrderVO> orderVOs = orderDao.listByPage(pageInfo,search,page);
        pageInfo.setTotal((int)page.getTotal());
        return new OrderPageDTO(orderVOs,pageInfo);
    }
}
