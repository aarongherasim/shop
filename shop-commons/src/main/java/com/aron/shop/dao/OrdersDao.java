package com.aron.shop.dao;

import com.aron.shop.dao.generic.GenericDaoImpl;
import com.aron.shop.model.Orders;

import javax.persistence.criteria.Order;

/**
 * Created by aron.gherasim on 11/29/2017.
 */
public class OrdersDao extends GenericDaoImpl <Orders, Long> {

    public OrdersDao() {
        super(Orders.class);
    }
}
