package org.oc_j2ee.projet3.business.impl.manager;

import org.oc_j2ee.projet3.consumer.contract.DaoFactory;

public abstract class AbstractManagerImpl {

    private DaoFactory daoFactory;

    protected DaoFactory getDaoFactory(){
        return daoFactory;
    }

    public void setDaoFactory(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }



}
