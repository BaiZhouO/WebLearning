package com.BuyingSystem.common.ReturnCodes;

public enum OrderReturnCode implements IReturnCode{
    EMPTY_CART(40000,"there are no product in your cart, please select something"),
    NOT_A_CUSTOMER(40001,"please login");

    private Integer code;

    private String message;

    private OrderReturnCode(Integer code, String message) {
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
