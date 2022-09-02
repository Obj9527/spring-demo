package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.consistent.Status;
import com.example.demo.dto.TransferForm;
import com.example.demo.form.Account;
import com.example.demo.form.Result;
import com.example.demo.service.AccountService;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-30
 */
@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/transfer")
    public Result<Account> handleTransfer(@RequestBody TransferForm transferForm) throws IOException {
        accountService.transfer(transferForm.getOutAcc(), transferForm.getInAcc(), Long.parseLong(transferForm.getMoney()));
        return new Result<>(Status.TRANS_SUCCESS, null, "");
    }
}
