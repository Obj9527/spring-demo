package com.example.demo.service;

import com.example.demo.form.Sale;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-22
 */
public interface SaleService {
    void save(Sale sale);

    Sale findById(Integer id);
}
