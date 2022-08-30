package com.example.demo.form;

import lombok.Data;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-29
 */
@Data
public class Account {
    private Long id;
    private String accountName;
    private Long money;

    public Account(Long id) {
        this.id = id;
    }
}
