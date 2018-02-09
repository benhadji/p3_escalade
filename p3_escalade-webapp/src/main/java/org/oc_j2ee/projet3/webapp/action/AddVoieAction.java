package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.oc_j2ee.projet3.business.contrat.manager.SecteurManager;
import org.oc_j2ee.projet3.business.contrat.manager.VoieManager;
import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Voie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddVoieAction extends ActionSupport implements SessionAware {

    private VoieManager voieManager;
    private SecteurManager secteurManager;
    private Voie voie;
    private List<Secteur> listeDesSecteur = new ArrayList<>();
    private Map<String, Object> session;


    public Map<String, Object> getSession() {
        return session;
    }

    public VoieManager getVoieManager() {
        return voieManager;
    }

    public void setVoieManager(VoieManager voieManager) {
        this.voieManager = voieManager;
    }

    public SecteurManager getSecteurManager() {
        return secteurManager;
    }

    public void setSecteurManager(SecteurManager secteurManager) {
        this.secteurManager = secteurManager;
    }

    public Voie getVoie() {
        return voie;
    }

    public void setVoie(Voie voie) {
        this.voie = voie;
    }

    public List<Secteur> getListeDesSecteur() {
        return listeDesSecteur;
    }

    public void setListeDesSecteur(List<Secteur> listeDesSecteur) {
        this.listeDesSecteur = listeDesSecteur;
    }



    public String execute() {


        if(session.containsKey("sessionUtilisateur")) {
            if(voie!=null){
                listeDesSecteur = secteurManager.getAllSecteurs();
                voieManager.addWay(voie);
                System.out.println("La nouvelle voie est :\n" +
                        "Secteur ID = " + voie.getSecteur_id() +
                        "\nNom Voie = " + voie.getNom() +
                        "\nEtat voie = " + voie.isEtat());

                addActionMessage("La nouvelle voie " + voie.getNom() + " a ete correctement enregistrée !!");


                return "success";
            }
            else{
                listeDesSecteur = secteurManager.getAllSecteurs();
                return "input";
            }
        }else
            return "login";

    }

    @Override
    public void validate() {
        if (voie != null) {
            if (voie.getNom().equals("")) {
                addFieldError("voie.nom", "Le champ nom de la voie ne peut être vide");
            }
            if (!voie.getNom().equals("") && voie.getNom().length() < 2) {
                addFieldError("voie.nom", "Le nom de la voie doit faire au minimum 2 caractères");
            }
        }
    }


    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}