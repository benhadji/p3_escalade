package org.oc_j2ee.projet3.consumer.impl.DAO;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

public abstract class AbstractDaoImpl {

    @Inject
    @Named
    private DataSource dataSource;


    protected DataSource getDataSource() {
        return dataSource;
    }
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }


}
