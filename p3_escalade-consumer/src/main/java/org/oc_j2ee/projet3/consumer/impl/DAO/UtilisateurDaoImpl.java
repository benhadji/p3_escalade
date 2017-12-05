package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.UtilisateurDAO;
import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.List;

public class UtilisateurDaoImpl extends AbstractDaoImpl implements UtilisateurDAO {
    @Override
    public void create(Utilisateur utilisateur) {

    }

    @Override
    public void update(Utilisateur utilisateur) {

    }

    @Override
    public void delete(Utilisateur utilisateur) {

    }

    @Override
    public Utilisateur getById(int id) {
        return null;
    }

    @Override
    public List<Utilisateur> getAllUsers() {
        return null;
    }

    @Override
    public boolean emailIActive(String email) {
        return false;
    }

    @Override
    public boolean loginActive(String login) {
        return false;
    }
}
