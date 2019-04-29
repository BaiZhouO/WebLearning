package com.BuyingSystem.service;

import com.BuyingSystem.common.PageInfo;
import com.BuyingSystem.common.dto.CartPageDTO;
import com.BuyingSystem.model.Cart;


import java.util.List;

public interface OrderCartService {

    void insertOrderCart(Cart cart);

    void deleteOrderCart(int Product_prod_id);

    void updateOrderCart(Cart cart);

    void updateOrderCartByTwoIds(Cart cart);

    Cart selectOrderCartById(int Product_prod_id);

    Cart selectOrderCartByTwoIds(int Product_prod_id, int cus_id);

    List<Cart> selectAll();

    Cart selectOrderCartByName(String prod_name);

    int selectOrderCartCount();

    CartPageDTO listByPage(PageInfo pageInfo, String search,int cus_id);

    double findFinalPrice();

    int findRecords();

}
