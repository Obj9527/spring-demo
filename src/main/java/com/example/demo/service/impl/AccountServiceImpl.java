package com.example.demo.service.impl;

import java.io.IOError;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.AccountDao;
import com.example.demo.form.Account;
import com.example.demo.service.AccountService;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-29
 */
@Service
@Transactional(rollbackFor = {RuntimeException.class, IOException.class})
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(Account out, Account in, Long money) {
        Account outAccount = accountDao.findById(out.getId());
        outAccount.setMoney(outAccount.getMoney() - money);
        accountDao.update(outAccount);
        Account inAccount = accountDao.findById(in.getId());
        inAccount.setMoney(inAccount.getMoney() + money);
        accountDao.update(inAccount);
    }

    @Override
    public void save(Account account) {

    }

    @Override
    public Account findById(Integer id) {
        return null;
    }

    @Override
    public List<Account> findAll() {
        return null;
    }
}
