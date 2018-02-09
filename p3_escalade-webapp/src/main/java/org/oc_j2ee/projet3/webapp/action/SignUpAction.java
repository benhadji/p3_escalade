package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.oc_j2ee.projet3.business.contrat.manager.UtilisateurManager;
import org.oc_j2ee.projet3.model.Utilisateur;

public class SignUpAction extends ActionSupport {

    private Utilisateur utilisateur;
    private String nom, prenom, email;
    private String password, passwordConfirm;
    private UtilisateurManager utilisateurManager;


    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UtilisateurManager getUtilisateurManager() {
        return utilisateurManager;
    }

    public void setUtilisateurManager(UtilisateurManager utilisateurManager) {
        this.utilisateurManager = utilisateurManager;
    }


    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }


    public String execute(){

        if(utilisateur!=null){

            addActionMessage("L'utilisateur " + utilisateur.getPrenom() + utilisateur.getNom() + " a ete correctement enregistré !!");
            return utilisateurManager.signupNewSubscriber(utilisateur);
        }
        else{
            return "input";
        }





    }


}
