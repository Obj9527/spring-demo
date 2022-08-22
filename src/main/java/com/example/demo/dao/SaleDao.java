package com.example.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.example.demo.form.Sale;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-19
 */
public interface SaleDao {
    void save(Sale sale);

    Sale findById(Integer id);
}
