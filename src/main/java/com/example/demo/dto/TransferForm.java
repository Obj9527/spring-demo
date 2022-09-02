package com.example.demo.dto;

import com.example.demo.form.Account;

import lombok.Data;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-30
 */
@Data
public class TransferForm {
    private Account outAcc;
    private Account inAcc;
    private String money;
}
