package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.oc_j2ee.projet3.business.contrat.manager.SecteurManager;
import org.oc_j2ee.projet3.business.contrat.manager.SiteManager;
import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Site;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddSecteurAction extends ActionSupport implements SessionAware {

    private SecteurManager secteurManager;
    private SiteManager siteManager;
    private Site site;
    private Secteur secteur;
    private List<Site> listeDesSite = new ArrayList<>();
    private Map<String, Object> session;


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
            if (secteur != null) {
                listeDesSite = siteManager.getAllSites();
                secteurManager.addSecteur(secteur);
                addActionMessage("Le nouveau secteur " + secteur.getNom() + " a ete correctement enregistré !!");

                return "success";
            } else {
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


    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public Map<String, Object> getSession() {
        return session;
    }
}
