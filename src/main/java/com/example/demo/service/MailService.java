package com.example.demo.service;

import javax.mail.MessagingException;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-23
 */
public interface MailService {
    void send() throws MessagingException;
}
