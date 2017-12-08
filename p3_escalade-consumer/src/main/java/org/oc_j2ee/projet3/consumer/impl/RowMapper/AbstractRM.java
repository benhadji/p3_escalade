package org.oc_j2ee.projet3.consumer.impl.RowMapper;

import org.oc_j2ee.projet3.consumer.contract.DaoFactory;

public abstract class AbstractRM {

    private DaoFactory daoFactory;
    protected  DaoFactory getDaoFactory(){
        return daoFactory;
    }

    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

}
