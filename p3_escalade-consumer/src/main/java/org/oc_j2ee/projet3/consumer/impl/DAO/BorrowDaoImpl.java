package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.BorrowDAO;
import org.oc_j2ee.projet3.model.Borrow;
import org.oc_j2ee.projet3.model.Topo;
import org.oc_j2ee.projet3.model.Utilisateur;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.Types;
import java.util.List;

public class BorrowDaoImpl extends AbstractDaoImpl implements BorrowDAO {


    @Override
    public void deleteBorrow(Topo topo, Utilisateur utilisateur) {

    }

    @Override
    public Borrow getTopoBorrowed(Utilisateur utilisateur, Topo topo) {
        return null;
    }

    @Override
    public List<Borrow> listTopoBorrowed(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public List<Borrow> getAllTopoBorrowed() {
        return null;
    }
}
