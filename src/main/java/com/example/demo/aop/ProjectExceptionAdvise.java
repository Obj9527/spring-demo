package com.example.demo.aop;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.form.Result;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-30
 */
@RestControllerAdvice
public class ProjectExceptionAdvise {
    @ExceptionHandler({HttpMessageNotReadableException.class})
    public Result handleException(Exception e) {
        return new Result<>("400", null, "You gave an incorrect value");
    }

    @ExceptionHandler({RuntimeException.class})
    public Result handleException1(Exception e) {
        return new Result<>("40001", null, e.getMessage());
    }
}
