package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.form.Account;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-29
 */
@Mapper
public interface AccountDao {
    void save(Account account);

    void update(Account account);

    Account findById(Long id);

    List<Account> findAll();
}
