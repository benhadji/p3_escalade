package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.oc_j2ee.projet3.business.contrat.manager.VoieManager;
import org.oc_j2ee.projet3.model.Voie;

import java.util.ArrayList;
import java.util.List;

public class ListeVoieAction extends ActionSupport {

    private VoieManager voieManager;
    private List<Voie> listeVoies = new ArrayList<>();




    public VoieManager getVoieManager() {
        return voieManager;
    }

    public void setVoieManager(VoieManager voieManager) {
        this.voieManager = voieManager;
    }

    public List<Voie> getListeVoies() {
        return listeVoies;
    }

    public void setListeVoies(List<Voie> listeVoies) {
        this.listeVoies = listeVoies;
    }


    public String execute(){
        listeVoies = voieManager.getAllVoie();
        return "success";

    }





}
