package com.BuyingSystem.common.dto;

import com.BuyingSystem.common.PageInfo;
import com.BuyingSystem.common.vo.CartVO;

import java.io.Serializable;
import java.util.List;

public class CartPageDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<CartVO> cartVOs;

    private PageInfo pageInfo;

    public CartPageDTO(List<CartVO> cartVOs,PageInfo pageInfo)
    {
        super();
        this.cartVOs = cartVOs;
        this.pageInfo = pageInfo;
    }

    public List<CartVO> getCartVOs() {
        return cartVOs;
    }

    public void setCartVOs(List<CartVO> cartVOs) {
        this.cartVOs = cartVOs;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }


}
