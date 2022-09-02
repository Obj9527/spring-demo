package com.example.demo.service.impl;

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
    public boolean transfer(Account out, Account in, Long money) {
        Account outAccount = accountDao.findById(out.getId());
        Account inAccount = accountDao.findById(in.getId());
        if(outAccount == null) {
            throw new RuntimeException("转出账号不存在，请输入正确的账号");
        }
        if(inAccount == null) {
            throw new RuntimeException("转入账号不存在，请输入正确的账号");
        }
        outAccount.setMoney(outAccount.getMoney() - money);
        accountDao.update(outAccount);
        inAccount.setMoney(inAccount.getMoney() + money);
        accountDao.update(inAccount);
        return true;
    }

    @Override
    public boolean save(Account account) {
        return false;
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
