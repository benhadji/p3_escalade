package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.BorrowDAO;
import org.oc_j2ee.projet3.model.Borrow;
import org.oc_j2ee.projet3.model.Topo;
import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.List;

public class BorrowDaoImpl extends AbstractDaoImpl implements BorrowDAO {

    @Override
    public void deleteBorrow(Topo topo, Utilisateur utilisateur) {

    }

    @Override
    public Borrow get(Utilisateur utilisateur, Topo topo) {
        return null;
    }

    @Override
    public List<Borrow> getTopoBorrowed(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public List<Borrow> getAllTopoBorrowed() {
        return null;
    }
}
