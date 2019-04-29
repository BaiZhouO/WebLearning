package com.BuyingSystem.common;

import java.io.Serializable;

public class WebPageResult implements Serializable
{
    public static final long serialVersionUID = 1L;

    private Object rows;

    private Integer total;

    public WebPageResult(Object rows, Integer total)
    {
        super();
        this.rows = rows;
        this.total = total;
    }

    public Object getRows() {
        return rows;
    }

    public void setRows(Object rows) {
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}
