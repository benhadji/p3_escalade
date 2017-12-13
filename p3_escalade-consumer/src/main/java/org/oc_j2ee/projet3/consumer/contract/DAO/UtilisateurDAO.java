package org.oc_j2ee.projet3.consumer.contract.DAO;

import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.List;

public interface UtilisateurDAO {

    void create(Utilisateur utilisateur);
    void update(Utilisateur utilisateur);
    void delete(Utilisateur utilisateur);
    Utilisateur getById(int id);
    List<Utilisateur> getAllUsers();




}
