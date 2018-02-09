package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.oc_j2ee.projet3.business.contrat.manager.LongueurManager;
import org.oc_j2ee.projet3.business.contrat.manager.VoieManager;
import org.oc_j2ee.projet3.model.Longueur;
import org.oc_j2ee.projet3.model.Voie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddLongueurAction extends ActionSupport implements SessionAware {

    private VoieManager voieManager;
    private LongueurManager longueurManager;
    private Longueur longueur;
    private List<Voie> listeDesVoies = new ArrayList<>();
    private Map<String, Object> session;


    public Map<String, Object> getSession() {
        return session;
    }

    public List<Voie> getListeDesVoies() {
        return listeDesVoies;
    }

    public void setListeDesVoies(List<Voie> listeDesVoies) {
        this.listeDesVoies = listeDesVoies;
    }

    public VoieManager getVoieManager() {
        return voieManager;
    }

    public void setVoieManager(VoieManager voieManager) {
        this.voieManager = voieManager;
    }

    public LongueurManager getLongueurManager() {
        return longueurManager;
    }

    public void setLongueurManager(LongueurManager longueurManager) {
        this.longueurManager = longueurManager;
    }

    public Longueur getLongueur() {
        return longueur;
    }

    public void setLongueur(Longueur longueur) {
        this.longueur = longueur;
    }




    public String execute() {

        if(session.containsKey("sessionUtilisateur")) {
            if (longueur != null) {
                listeDesVoies = voieManager.getAllVoie();
                longueurManager.create(longueur);
                System.out.println("La nouvelle longueur est :\n" +
                        "voie ID = " + longueur.getVoie_id() +
                        "\nNom Longueur = " + longueur.getNom() +
                        "\nCotation longueur = " + longueur.getCotation());

                addActionMessage("La nouvelle longueur ('" + longueur.getNom() + "') a ete correctement enregistré !!");


                return "success";
            } else {
                listeDesVoies = voieManager.getAllVoie();
                return "input";
            }
        }else
            return "login";

    }

    @Override
    public void validate() {
        if (longueur != null) {
            if (longueur.getNom().equals("")) {
                addFieldError("longueur.nom", "Le champ nom de la longueur ne peut être vide");
            }
            if (!longueur.getNom().equals("") && longueur.getNom().length() < 2) {
                addFieldError("longueur.nom", "Le nom de la longueur doit faire au minimum 2 caractères");
            }
        }
    }


    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
