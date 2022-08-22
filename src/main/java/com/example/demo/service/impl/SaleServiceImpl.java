package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SaleDao;
import com.example.demo.form.Sale;
import com.example.demo.service.SaleService;

/**
 * 功能描述
 *
 * @author h30032094
 * @since 2022-08-22
 */
@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleDao saleDao;

    @Override
    public void save(Sale sale) {
        saleDao.save(sale);
    }

    @Override
    public Sale findById(Integer id) {
        return saleDao.findById(id);
    }
}
