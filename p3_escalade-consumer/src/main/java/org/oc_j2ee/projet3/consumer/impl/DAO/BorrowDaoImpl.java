package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.BorrowDAO;
import org.oc_j2ee.projet3.consumer.impl.RowMapper.BorrowRM;
import org.oc_j2ee.projet3.model.Borrow;
import org.oc_j2ee.projet3.model.Topo;
import org.oc_j2ee.projet3.model.Utilisateur;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.inject.Inject;
import java.sql.Types;
import java.util.List;

public class BorrowDaoImpl extends AbstractDaoImpl implements BorrowDAO {

    @Inject
    private BorrowRM borrowRM;

    public BorrowRM getBorrowRM() {
        return borrowRM;
    }
    public void setBorrowRM(BorrowRM borrowRM) {
        this.borrowRM = borrowRM;
    }



    @Override
    public List<Borrow> getAllTopoBorrowed() {

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        String sql = "SELECT * FROM borrow";

        List<Borrow> vList = vJdbcTemplate.query(sql, borrowRM);
        return vList;
    }
}
