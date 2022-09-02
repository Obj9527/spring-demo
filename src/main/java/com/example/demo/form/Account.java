package com.example.demo.form;

import lombok.Data;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-29
 */
public class Account {
    private Long id;
    private String accountName;
    private Long money;

    public Account() {
    }

    public Account(Long id) {
        this.id = id;
    }

    public Account(Long id, String accountName, Long money) {
        this.id = id;
        this.accountName = accountName;
        this.money = money;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }
}
