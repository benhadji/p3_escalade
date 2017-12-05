package org.oc_j2ee.projet3.business.impl.manager;

import org.oc_j2ee.projet3.business.contrat.manager.UtilisateurManager;
import org.oc_j2ee.projet3.model.Utilisateur;

import javax.inject.Named;
import java.util.List;

@Named
public class UtilisateurManagerImpl extends AbstractManagerImpl implements UtilisateurManager {
    @Override
    public Utilisateur displayUser(int id) {
        return null;
    }

    @Override
    public String hashPassword(String password) {
        return null;
    }

    @Override
    public Utilisateur getLoginUser(String username) {
        return null;
    }

    @Override
    public boolean validateLogin(Utilisateur utilisateur, String password) {
        return false;
    }

    @Override
    public String signIn(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public List<Utilisateur> displayAllUsers() {
        return null;
    }
}
