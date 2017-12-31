package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.oc_j2ee.projet3.business.contrat.manager.SecteurManager;
import org.oc_j2ee.projet3.model.Secteur;

import java.util.ArrayList;
import java.util.List;

public class ListeSecteurAction extends ActionSupport {

    private SecteurManager secteurManager;
    private List<Secteur> secteurs = new ArrayList<>();
    private Integer secteur_id;

    public Integer getSecteur_id() {
        return secteur_id;
    }

    public void setSecteur_id(Integer secteur_id) {
        this.secteur_id = secteur_id;
    }

    public SecteurManager getSecteurManager() {
        return secteurManager;
    }

    public void setSecteurManager(SecteurManager secteurManager) {
        this.secteurManager = secteurManager;
    }

    public List<Secteur> getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(List<Secteur> secteurs) {
        this.secteurs = secteurs;
    }


    public String execute(){
        secteurs = secteurManager.getAllSecteurs();
        return "success";

    }




}
