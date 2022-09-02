package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.AccountDao;
import com.example.demo.dao.LogDao;
import com.example.demo.form.Account;
import com.example.demo.form.Log;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-29
 */
@Component
@Aspect
public class LogAdvise {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private LogDao logDao;

    @Pointcut("execution(* com.example.demo.service.AccountService.*(..))")
    private void servicePt(){}

    @Around("LogAdvise.servicePt()")
    public Object recordTransfer(ProceedingJoinPoint joinPoint) throws Throwable {
        Object args[] = joinPoint.getArgs();
        Long outId = ((Account) args[0]).getId();
        Long inId = ((Account) args[1]).getId();
        String money = args[2].toString();
        String message = String.format("由%s转到%s金额为%s", outId, inId, money);
        Object result = null;

        try {
            result = joinPoint.proceed();
            Log log = new Log(message, money, "成功");
            logDao.save(log);
        } catch (Exception e) {
            Log log = new Log(message, money, "失败", e.toString());
            logDao.save(log);
            throw e;
        }
        return result;
    }
}
