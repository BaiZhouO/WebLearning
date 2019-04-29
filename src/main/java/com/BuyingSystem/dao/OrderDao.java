package com.BuyingSystem.dao;

import com.BuyingSystem.common.PageInfo;
import com.BuyingSystem.common.vo.OrderVO;
import com.BuyingSystem.model.Order;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface OrderDao {

    void insertOrder(@Param("order")Order order);

    void deleteOrder(int order_id);

    void updateOrder(@Param("order_new")Order order);

    Order selectOrderById(int order_id);

    List<Order> selectAll();

    Order selectOrderByName(String prod_name);

    int selectOrderCount();

    List<OrderVO> listByCusId(@Param("pageInfo")PageInfo pageInfo,
                              @Param("search")String search,
                              @Param("cus_id")int cus_id,
                              RowBounds rowBounds);

    List<OrderVO> listByPage(@Param("pageInfo")PageInfo pageInfo,
                             @Param("search")String search,
                             RowBounds rowBounds);

}
