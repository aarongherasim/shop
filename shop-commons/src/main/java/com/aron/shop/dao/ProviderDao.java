package com.aron.shop.dao;

import com.aron.shop.dao.generic.GenericDaoImpl;
import com.aron.shop.model.Provider;

/**
 * Created by aron.gherasim on 11/29/2017.
 */
public class ProviderDao extends GenericDaoImpl <Provider, Long> {

    public ProviderDao() {
        super(Provider.class);
    }
}
