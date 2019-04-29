package com.BuyingSystem.common.ReturnCodes;

public enum RegisterReturnCode implements IReturnCode{
    ADDTO_DATABASE_FAILED(20001,"Data adding failed: database busy");

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 消息
     */
    private String message;

    private RegisterReturnCode(Integer code, String message) {
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
