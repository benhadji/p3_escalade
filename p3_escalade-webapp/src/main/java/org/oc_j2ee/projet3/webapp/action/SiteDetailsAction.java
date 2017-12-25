package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.oc_j2ee.projet3.business.contrat.manager.LongueurManager;
import org.oc_j2ee.projet3.business.contrat.manager.SecteurManager;
import org.oc_j2ee.projet3.business.contrat.manager.SiteManager;
import org.oc_j2ee.projet3.business.contrat.manager.VoieManager;
import org.oc_j2ee.projet3.model.Longueur;
import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Voie;

import java.util.ArrayList;
import java.util.List;

public class SiteDetailsAction extends ActionSupport {

    private SiteManager siteManager;
    private Site site;
    private Integer site_id;



// ******************************************* Manager ************************************** //
    public SiteManager getSiteManager() {
    return siteManager;
}
    public void setSiteManager(SiteManager siteManager) {
        this.siteManager = siteManager;
    }


// ******************************************* Model ************************************** //
    public Site getSite() {
        return site;
    }
    public void setSite(Site site) {
        this.site = site;
    }


// ******************************************* ID ************************************** //

    public Integer getSite_id() {
        return site_id;
    }
    public void setSite_id(Integer site_id) {
        this.site_id = site_id;
    }



// ******************************************* List ************************************** //


    public String execute(){

        this.site = siteManager.getSite(this.site_id);

        return "success";

    }


}
