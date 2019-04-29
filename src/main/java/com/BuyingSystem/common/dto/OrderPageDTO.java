package com.BuyingSystem.common.dto;

import com.BuyingSystem.common.PageInfo;
import com.BuyingSystem.common.vo.OrderVO;
import com.baomidou.mybatisplus.plugins.Page;

import java.io.Serializable;
import java.util.List;

public class OrderPageDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<OrderVO> orderVOs;

    private PageInfo pageInfo;

    public OrderPageDTO(List<OrderVO> orderVOs, PageInfo pageInfo)
    {
        super();
        this.orderVOs = orderVOs;
        this.pageInfo = pageInfo;
    }

    public List<OrderVO> getOrderVOs() {
        return orderVOs;
    }

    public void setOrderVOs(List<OrderVO> orderVOs) {
        this.orderVOs = orderVOs;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;

    }

}
