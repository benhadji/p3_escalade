package org.oc_j2ee.projet3.consumer.impl.RowMapper;


import org.oc_j2ee.projet3.model.Borrow;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BorrowRM extends AbstractRM implements RowMapper<Borrow> {
    @Override
    public Borrow mapRow(ResultSet rs, int i) throws SQLException {

        Borrow borrow = new Borrow();
        borrow.setStartDate(rs.getDate("start_date"));
        borrow.setEndDate(rs.getDate("end_date"));
        borrow.setBorrowerId(rs.getInt("borrower_id"));

        TopoRM topoRM = new TopoRM();
        borrow.setTopo(topoRM.mapRow(rs,i));

        return borrow;




    }
}
