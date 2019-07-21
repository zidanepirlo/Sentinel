package com.alibaba.csp.sentinel.demo.annotation.aop.Exception;

/**
 * MyException
 *
 * @author yuanqing
 * @create 2019-07-18 09:03
 **/
public class MyException extends Exception{

    private String message;

    public MyException(String message) {
        super(message);
        this.message = message;
    }
    public MyException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
