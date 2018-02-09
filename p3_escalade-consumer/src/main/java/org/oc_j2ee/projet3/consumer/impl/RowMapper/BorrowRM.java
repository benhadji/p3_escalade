package org.oc_j2ee.projet3.consumer.impl.RowMapper;


import org.oc_j2ee.projet3.model.Borrow;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BorrowRM implements RowMapper<Borrow> {

    @Override
    public Borrow mapRow(ResultSet rs, int i) throws SQLException {

        Borrow borrow = new Borrow();
        borrow.setId(rs.getInt("id"));
        borrow.setStartDate(rs.getDate("startdate"));
        borrow.setEndDate(rs.getDate("enddate"));
        borrow.setUtilisateurId(rs.getInt("utilisateur_Id"));
        borrow.setTopoId(rs.getInt("topo_id"));

        return borrow;

    }
}
