package com.aron.shop.dao;

import com.aron.shop.dao.generic.GenericDaoImpl;
import com.aron.shop.model.Clients;

/**
 * Created by aron.gherasim on 11/29/2017.
 */
public class ClientsDao extends GenericDaoImpl<Clients, Long> {

    public ClientsDao() {
        super(Clients.class);
    }
}
