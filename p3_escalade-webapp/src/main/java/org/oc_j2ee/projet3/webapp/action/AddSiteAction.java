package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.oc_j2ee.projet3.business.contrat.manager.SiteManager;
import org.oc_j2ee.projet3.model.Site;

public class AddSiteAction extends ActionSupport {


    private SiteManager siteManager;
    private Site site;


    public SiteManager getSiteManager() {
        return siteManager;
    }
    public void setSiteManager(SiteManager siteManager) {
        this.siteManager = siteManager;
    }

    public Site getSite() {
        return site;
    }
    public void setSite(Site site) {
        this.site = site;
    }


    public String execute(){

        if(site!=null){
            siteManager.addSite(site);
            return "success";
        }
        else{
            return "input";
        }

    }

    @Override
    public void validate() {
        if (site != null) {
            if (site.getNom().equals("")) {
                addFieldError("site.nom", "Le nom du site ne peut être vide");
            }
            if (!site.getNom().equals("") && site.getNom().length() < 2) {
                addFieldError("site.nom", "Le nom du site doit faire au minimum 2 caractères");
            }
            if (site.getLocalisation().equals("")) {
                addFieldError("site.localisation", "Le nom de la commune entrée n'est pas valide");
            }
            if (!site.getLocalisation().equals("") && site.getLocalisation().length() < 2) {
                addFieldError("site.location", "Le nom de la commune entrée n'est pas valide");
            }
        }
    }

}
