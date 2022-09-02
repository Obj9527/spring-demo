package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import com.example.demo.form.Account;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-29
 */
public interface AccountService {
    boolean transfer(Account out, Account in, Long money) throws IOException;

    boolean save(Account account);

    Account findById(Integer id);

    List<Account> findAll();
}
