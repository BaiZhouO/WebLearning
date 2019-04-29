package com.BuyingSystem.common;

import com.BuyingSystem.common.ReturnCodes.IReturnCode;

import java.io.Serializable; //webresult对象需要进行网络传输，故而需要持久化（转换为字节流），所以必须先序列化（将Java对象序列化为二进制文件）


public class WebResult implements Serializable{
    private static final long serialVersionUID = 1L;

    //状态码
    private Integer code;

    //返回的信息
    private String message;

    //定义一个data为对象，其他返回对象
    private Object data;

    //用returnCode接口作为参数的构造函数1
    public WebResult(IReturnCode returnCode)
    {
        super();
        this.code = returnCode.getCode();
        this.message = returnCode.getMessage();
    }

    //直接传参的构造函数2
    public WebResult(Integer code, String message)
    {
        super();
        this.code = code;
        this.message = message;
    }

    //alt+insert直接完成getter和setter
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
