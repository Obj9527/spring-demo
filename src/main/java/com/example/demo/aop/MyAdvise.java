package com.example.demo.aop;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-16
 */
@Component
@Aspect
public class MyAdvise {
    @Pointcut("execution(* com.example.demo.service.*Service.*(..))")
    private void servicePt(){}

    @Pointcut("execution(* com.example.demo.service.*Service.openUrl(..))")
    private void checkPasswordPt() {}

    @Around("MyAdvise.servicePt()")
    public Object runSpeed(ProceedingJoinPoint joinPoint) throws Throwable {
        Long start = System.currentTimeMillis();
        Object ret = joinPoint.proceed();
        Long end = System.currentTimeMillis();
        System.out.println(joinPoint.getSignature() + "--执行时间：" + (end - start) + "ms");
        return ret;
    }

    @Around("MyAdvise.checkPasswordPt()")
    public Object handlePassword(ProceedingJoinPoint joinPoint) throws Throwable {
        Object args[] = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
        for (int i = 0; i < args.length; i++) {
            if(args[i].getClass().equals(String.class)) {
                args[i] = args[i].toString().trim();
            }
        }
        return joinPoint.proceed(args);
    }
}
