package org.oc_j2ee.projet3.consumer;

import javax.sql.DataSource;

public abstract class AbstractDaoImpl {
	
	@Inject
	@Named("datasourceP3")
	private DataSource datasrource;
	
	protected DataSource getDataSource() {
		return datasrource;
		
	}

}
