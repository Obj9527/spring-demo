package com.example.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.form.Log;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-29
 */
@Mapper
public interface LogDao {
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void save(Log log);
}
