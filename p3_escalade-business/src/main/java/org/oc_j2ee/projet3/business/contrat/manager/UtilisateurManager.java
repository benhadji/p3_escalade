package org.oc_j2ee.projet3.business.contrat.manager;

import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.List;

public interface UtilisateurManager {

    Utilisateur displayUser(int id);
    String hashPassword(String password);
    Utilisateur getLoginUser(String username);
    boolean validateLogin (Utilisateur utilisateur, String password);
    String signIn(Utilisateur utilisateur);
    List<Utilisateur> displayAllUsers();

}
