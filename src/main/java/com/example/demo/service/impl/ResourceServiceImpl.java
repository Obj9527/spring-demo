package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.ResourceService;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-18
 */
@Service
public class ResourceServiceImpl implements ResourceService {
    @Override
    public boolean openUrl(String url, String password) {
        String validator = "admin";
        System.out.println("密码长度： " + password.length());
        return validator.equals(password);
    }
}
