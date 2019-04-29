package com.BuyingSystem.service.impl;

import com.BuyingSystem.common.PageInfo;
import com.BuyingSystem.common.dto.CartPageDTO;
import com.BuyingSystem.common.vo.CartVO;
import com.BuyingSystem.dao.OrderCartDao;
import com.BuyingSystem.model.Cart;
import com.BuyingSystem.service.OrderCartService;
import com.baomidou.mybatisplus.plugins.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("OrderCartService")
public class OrderCartServiceImpl implements OrderCartService {
    @Resource
    private OrderCartDao orderCartDao;

    public void insertOrderCart(Cart cart){
        orderCartDao.insertOrderCart(cart);
    }

    public void deleteOrderCart(int Product_prod_id)
    {
        orderCartDao.deleteOrderCart(Product_prod_id);
    }


    public void updateOrderCart(Cart cart)
    {
        orderCartDao.updateOrderCart(cart);
    }

    public void updateOrderCartByTwoIds(Cart cart)
    {
        orderCartDao.updateOrderCartByTwoIds(cart);
    }


    public Cart selectOrderCartById(int Product_prod_id)
    {
        return orderCartDao.selectOrderCartById(Product_prod_id);
    }

    public Cart selectOrderCartByTwoIds(int product_prod_id, int cus_id)
    {
        return orderCartDao.selectOrderCartByTwoIds(product_prod_id,cus_id);
    }

    public List<Cart> selectAll()
    {
        return orderCartDao.selectAll();
    }

    public Cart selectOrderCartByName(String prod_name)
    {
        return orderCartDao.selectOrderCartByName(prod_name);
    }

    public int selectOrderCartCount()
    {
        return orderCartDao.selectOrderCartCount();
    }

    public CartPageDTO listByPage(PageInfo pageInfo, String search, int cus_id){
        Page<CartVO> page = new Page<>(pageInfo.getCurrent(),pageInfo.getLimit());//分页实体，注意此处page为mybatis-plus扩展框架的类，创建对象没有经过序列化，故不经过spring注入，直接new就行
        List<CartVO> cartVOs = orderCartDao.listByPage(pageInfo,search,cus_id,page);
        pageInfo.setTotal((int)page.getTotal());
        return new CartPageDTO(cartVOs,pageInfo);

    }

    public double findFinalPrice()
    {
        return orderCartDao.findFinalPrice();
    }

    public int findRecords()
    {
        return orderCartDao.findRecords();
    }
}
