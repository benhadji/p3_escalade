package org.oc_j2ee.projet3.business.contrat.manager;

import org.oc_j2ee.projet3.model.Borrow;
import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.List;

public interface BorrowManager {

    List<Borrow> getBorrowListByUser(Utilisateur utilisateur);
    List<Borrow> getBorrowList();

}
