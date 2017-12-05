package org.oc_j2ee.projet3.consumer.impl.DAO;

import javax.sql.DataSource;

public abstract class AbstractDaoImpl {

    private DataSource dataSource;


    protected DataSource getDataSource() {
        return dataSource;
    }
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }


}
