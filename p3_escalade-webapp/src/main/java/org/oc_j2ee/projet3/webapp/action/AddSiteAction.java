package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.oc_j2ee.projet3.business.contrat.manager.SiteManager;
import org.oc_j2ee.projet3.model.Site;

import java.util.Map;

public class AddSiteAction extends ActionSupport implements SessionAware{


    private SiteManager siteManager;
    private Site newSite;
    private Map<String, Object> session;

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public SiteManager getSiteManager() {
        return siteManager;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public void setSiteManager(SiteManager siteManager) {
        this.siteManager = siteManager;
    }

    public Site getNewSite() {
        return newSite;
    }

    public void setNewSite(Site newSite) {
        this.newSite = newSite;
    }

    public String execute(){


        if(newSite!=null){
            siteManager.addSite(newSite);
            addActionMessage("Le nouveau site " + newSite.getNom() + " a ete correctement enregistré !!");

            return "success";
        }
        else{
            return "input";
        }

    }

    @Override
    public void validate() {
        if (newSite != null) {
            if (newSite.getNom().equals("")) {
                addFieldError("site.nom", "Le nom du site ne peut être vide");
            }
            if (!newSite.getNom().equals("") && newSite.getNom().length() < 2) {
                addFieldError("site.nom", "Le nom du site doit faire au minimum 2 caractères");
            }
            if (newSite.getLocalisation().equals("")) {
                addFieldError("site.localisation", "Le nom de la commune entrée n'est pas valide");
            }
            if (!newSite.getLocalisation().equals("") && newSite.getLocalisation().length() < 2) {
                addFieldError("site.location", "Le nom de la commune entrée n'est pas valide");
            }
        }
    }

}
