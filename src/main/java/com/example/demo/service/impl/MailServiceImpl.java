package com.example.demo.service.impl;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.demo.service.MailService;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-23
 */
@Service
public class MailServiceImpl implements MailService {
    @Override
    public void send() throws MessagingException {
        // 设置相关属性
        Properties props = new Properties();
        props.setProperty("mail.smtp.host", "smtp.email.qq.com");
        props.setProperty("mail.transport.protocol", "smtp");
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.smtp.timeout", "20000");

        // 获取session，创建认证器，指定用户名和密码
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("1213699301@qq.com", "");
            }
        });

        MimeMessage message = new MimeMessage(session);
        MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
        helper.setTo(new String[]{"993759231@qq.com"});
        helper.setFrom("1213699301@qq.com");
        helper.setSubject("这是一个主题");
        helper.setText("<h4>HTML 今天下午大家一起去ktv唱歌！！！</h4> \" + \"<div>Send By Java Mail</div>", true);

        // 发送消息
        Transport.send(message);
        System.out.println("Sent message successfully....");
    }
}
