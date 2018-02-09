package org.oc_j2ee.projet3.business.impl.manager;

import org.oc_j2ee.projet3.business.contrat.manager.UtilisateurManager;
import org.oc_j2ee.projet3.model.Topo;
import org.oc_j2ee.projet3.model.Utilisateur;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.crypto.bcrypt.BCrypt;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class UtilisateurManagerImpl extends AbstractManagerImpl implements UtilisateurManager {


    @Override
    public Utilisateur displayUser(int id) {

        return getDaoFactory().getUtilisateurDAO().getById(id);
    }

    @Override
    public String hashPassword(String password) {

        String salt = BCrypt.gensalt();
        String passwordHash = BCrypt.hashpw(password, salt);

        return passwordHash;

    }

    @Override
    public Utilisateur getLoginUser(String email) {

        Utilisateur user = new Utilisateur();

        try{
            user = getDaoFactory().getUtilisateurDAO().findByLogin(email);
        }catch(EmptyResultDataAccessException e){
            e.printStackTrace();
        }
        return user;    }

    @Override
    public boolean validateLogin(Utilisateur utilisateur, String password) {

        boolean passwordChecked = false;

        if(utilisateur.getPassword() == null || !utilisateur.getPassword().startsWith("$2a$")){
            System.out.println();
            throw new IllegalArgumentException("Le hash password n'est pas valide");
        }

        passwordChecked = BCrypt.checkpw(password, utilisateur.getPassword());

        return passwordChecked;
    }

    @Override
    public String signupNewSubscriber(Utilisateur utilisateur) {

         String encryptedPassword= hashPassword(utilisateur.getPassword());
                utilisateur.setPassword(encryptedPassword);
                utilisateur.setRole("USER");
                getDaoFactory().getUtilisateurDAO().create(utilisateur);

        return "success";
    }

    @Override
    public void addUser(Utilisateur utilisateur) {
        getDaoFactory().getUtilisateurDAO().create(utilisateur);
    }
}
