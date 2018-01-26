package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.oc_j2ee.projet3.business.contrat.manager.*;
import org.oc_j2ee.projet3.model.Voie;

import java.util.ArrayList;
import java.util.List;

public class HomeAction extends ActionSupport {


    private SiteManager siteManager;



    public SiteManager getSiteManager() {
        return siteManager;
    }

    public void setSiteManager(SiteManager siteManager) {
        this.siteManager = siteManager;
    }


    public String execute(){


        return "success";



    }


}
