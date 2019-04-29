package com.BuyingSystem.dao;

import com.BuyingSystem.common.PageInfo;
import com.BuyingSystem.common.vo.CartVO;
import com.BuyingSystem.model.Cart;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface OrderCartDao {
    void insertOrderCart(@Param("cart")Cart cart);

    void deleteOrderCart(int Product_prod_id);

    void updateOrderCart(@Param("cart_new")Cart cart);

    void updateOrderCartByTwoIds(@Param("cart_new2")Cart cart);

    Cart selectOrderCartById(int Product_prod_id);

    Cart selectOrderCartByTwoIds(@Param("Product_prod_id") int Product_prod_id,
                                 @Param("cus_id") int cus_id);

    List<Cart> selectAll();

    Cart selectOrderCartByName(String prod_name);

    int selectOrderCartCount();

    List<CartVO> listByPage(@Param("pageInfo")PageInfo pageInfo, @Param("search")String search, @Param("cus_id")int cus_id, RowBounds rowBounds);

    double findFinalPrice();

    int findRecords();
}
