package com.shuiyu.domain;


import java.io.Serializable;

/**
 * 向页面传递信息的类
 */
public class Result implements Serializable {

    private boolean success;// 成功
    private String message;//返回页面的信息

    //构造器
    public Result(boolean success, String message) {
        super();
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
