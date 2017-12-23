package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.oc_j2ee.projet3.business.contrat.manager.SiteManager;
import org.oc_j2ee.projet3.model.Site;


import java.util.ArrayList;
import java.util.List;

public class HomeAction extends ActionSupport {

    SiteManager siteManager;
    List<Site> sites = new ArrayList<>();

    public String execute(){

        return "success";

    }

    public SiteManager getSiteManager() {
        return siteManager;
    }

    public void setSiteManager(SiteManager siteManager) {
        this.siteManager = siteManager;
    }

    public List<Site> getSites() {
        sites = siteManager.getAllSites();
        return sites;
    }


    public void setSites(List<Site> sites) {
        this.sites = sites;
    }
}
