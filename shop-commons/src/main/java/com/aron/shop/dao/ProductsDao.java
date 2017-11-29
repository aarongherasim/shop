package com.aron.shop.dao;

import com.aron.shop.dao.generic.GenericDaoImpl;
import com.aron.shop.model.Products;

/**
 * Created by aron.gherasim on 11/29/2017.
 */
public class ProductsDao extends GenericDaoImpl <Products, Long> {

    public ProductsDao() {
        super(Products.class);
    }
}
