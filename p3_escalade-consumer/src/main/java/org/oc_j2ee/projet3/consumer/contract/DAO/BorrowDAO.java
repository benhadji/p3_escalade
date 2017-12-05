package org.oc_j2ee.projet3.consumer.contract.DAO;

import org.oc_j2ee.projet3.model.Borrow;
import org.oc_j2ee.projet3.model.Topo;
import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.List;

public interface BorrowDAO {

    void deleteBorrow(Topo topo, Utilisateur utilisateur);
    Borrow get(Utilisateur utilisateur, Topo topo);
    List<Borrow> getTopoBorrowed(Utilisateur utilisateur);
    List<Borrow> getAllTopoBorrowed();

}
