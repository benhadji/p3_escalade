package org.oc_j2ee.projet3.business.impl.manager;

import org.oc_j2ee.projet3.business.contrat.manager.BorrowManager;
import org.oc_j2ee.projet3.model.Borrow;
import org.oc_j2ee.projet3.model.Utilisateur;

import javax.inject.Named;
import java.util.List;

@Named
public class BorrowManagerImpl extends AbstractManagerImpl implements BorrowManager {
    @Override
    public List<Borrow> getBorrowListByUser(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public List<Borrow> getBorrowList() {

        return getDaoFactory().getBorrowDAO().getAllTopoBorrowed();


    }
}
