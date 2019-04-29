package com.BuyingSystem.common.ReturnCodes;

public enum LoginReturnCode implements IReturnCode{
    USER_NOT_EXIST(10000, "该账号不存在!"),
    WRONG_PASSWORD(10001, "您输入的密码不正确!");

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 消息
     */
    private String message;

    private LoginReturnCode(Integer code, String message) {
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
