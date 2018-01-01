package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.oc_j2ee.projet3.business.contrat.manager.LongueurManager;
import org.oc_j2ee.projet3.model.Longueur;

import java.util.ArrayList;
import java.util.List;

public class ListeLongueurAction extends ActionSupport {

    private List<Longueur> listeLongueurs = new ArrayList<>();
    private LongueurManager longueurManager;

    public List<Longueur> getListeLongueurs() {
        return listeLongueurs;
    }

    public void setListeLongueurs(List<Longueur> listeLongueurs) {
        this.listeLongueurs = listeLongueurs;
    }

    public LongueurManager getLongueurManager() {
        return longueurManager;
    }

    public void setLongueurManager(LongueurManager longueurManager) {
        this.longueurManager = longueurManager;
    }






    public String execute(){
        listeLongueurs = longueurManager.getAllLongueur();
        return "success";

    }

}
