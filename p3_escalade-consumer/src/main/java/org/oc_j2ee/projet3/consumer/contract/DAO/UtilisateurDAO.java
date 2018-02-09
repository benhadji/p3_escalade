package org.oc_j2ee.projet3.consumer.contract.DAO;

import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.List;

public interface UtilisateurDAO {

    void create(Utilisateur utilisateur);
    Utilisateur getById(int id);
    Utilisateur findByLogin(String username);
}
