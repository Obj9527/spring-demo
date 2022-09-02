package com.example.demo.form;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-30
 */
public class Result<T> {
    private String code;
    private T data;
    private String message;

    public Result() {
    }

    public Result(String code, T data) {
        this.code = code;
        this.data = data;
    }

    public Result(String code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
