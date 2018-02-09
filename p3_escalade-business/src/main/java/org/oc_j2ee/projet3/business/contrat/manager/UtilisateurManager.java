package org.oc_j2ee.projet3.business.contrat.manager;

import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.List;

public interface UtilisateurManager {

    Utilisateur displayUser(int id);
    String hashPassword(String password);
    Utilisateur getLoginUser(String email);
    boolean validateLogin (Utilisateur utilisateur, String password);
    void addUser(Utilisateur utilisateur);
    String signupNewSubscriber(Utilisateur utilisateur);

}
