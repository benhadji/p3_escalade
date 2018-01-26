package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.oc_j2ee.projet3.business.contrat.manager.SecteurManager;
import org.oc_j2ee.projet3.business.contrat.manager.SiteManager;
import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Site;

import java.util.ArrayList;
import java.util.List;

public class AddSecteurAction extends ActionSupport {

    private SecteurManager secteurManager;
    private SiteManager siteManager;
    private Site site;
    private Secteur secteur;
    private List<Site> listeDesSite = new ArrayList<>();

    public List<Site> getListeDesSite() {
        return listeDesSite;
    }

    public void setListeDesSite(List<Site> listeDesSite) {
        this.listeDesSite = listeDesSite;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public SiteManager getSiteManager() {
        return siteManager;
    }

    public void setSiteManager(SiteManager siteManager) {
        this.siteManager = siteManager;
    }

    public SecteurManager getSecteurManager() {
        return secteurManager;
    }

    public void setSecteurManager(SecteurManager secteurManager) {
        this.secteurManager = secteurManager;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }


    public String execute(){

        if(secteur!=null){
            secteurManager.addSecteur(secteur);

            return "success";
        }
        else{
            listeDesSite = siteManager.getAllSites();
            return "input";
        }

    }

    @Override
    public void validate() {
        if (secteur != null) {
            if (secteur.getNom().equals("")) {
                addFieldError("secteur.nom", "Le nom du secteur ne peut être vide");
            }
            if (!secteur.getNom().equals("") && secteur.getNom().length() < 2) {
                addFieldError("secteur.nom", "Le nom du secteur doit faire au minimum 2 caractères");
            }
        }
    }




}
