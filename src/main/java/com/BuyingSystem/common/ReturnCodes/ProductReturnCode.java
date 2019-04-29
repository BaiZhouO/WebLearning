package com.BuyingSystem.common.ReturnCodes;

public enum ProductReturnCode implements IReturnCode{
    PRODUCT_NOT_FOUND(30000,"found no product according to prod_id"),
    PRODUCT_HAS_BEEN_ADD_TO_CART(30001,"this product has been add to cart!");

    private Integer code;

    private String message;

    private ProductReturnCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
