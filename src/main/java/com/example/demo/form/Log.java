package com.example.demo.form;

import java.util.Date;

import lombok.Data;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-29
 */
@Data
public class Log {
    private String message;
    private String money;
    private String status;
    private String reason;
    private Date createTime;

    public Log(String message, String money, String status) {
        this.message = message;
        this.money = money;
        this.status = status;
    }

    public Log(String message, String money, String status, String reason) {
        this.message = message;
        this.money = money;
        this.status = status;
        this.reason = reason;
    }
}
