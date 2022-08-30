package com.example.demo.BeanTest;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.example.demo.config.SpringConfig;
import com.example.demo.form.Account;
import com.example.demo.service.AccountService;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-29
 */
@SpringBootTest
@ContextConfiguration(classes = SpringConfig.class)
class AccountServiceImplTest {
    @Autowired
    private AccountService accountService;

    @Test
    void transfer() throws IOException {
        accountService.transfer(new Account(6L), new Account(1L), 133L);
        System.out.println("transfer success");
    }

    @Test
    void save() {
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }
}