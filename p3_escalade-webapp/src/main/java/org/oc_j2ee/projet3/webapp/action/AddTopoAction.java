package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;

import org.apache.struts2.interceptor.SessionAware;
import org.oc_j2ee.projet3.business.contrat.manager.SiteManager;
import org.oc_j2ee.projet3.business.contrat.manager.TopoManager;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Topo;
import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class AddTopoAction extends ActionSupport implements SessionAware {

    private Topo topo;
    private Site site;
    private TopoManager topoManager;
    private SiteManager siteManager;
    private List<Site> sitesList = new ArrayList<>();
    private Map<String, Object> session;


    public List<Site> getSitesList() {
        return sitesList;
    }

    public void setSitesList(List<Site> sitesList) {
        this.sitesList = sitesList;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
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

    public TopoManager getTopoManager() {
        return topoManager;
    }

    public void setTopoManager(TopoManager topoManager) {
        this.topoManager = topoManager;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }



    public String execute(){

        if(session.containsKey("sessionUtilisateur")) {
            if (topo != null) {
                Utilisateur utilisateur = (Utilisateur) session.get("sessionUtilisateur");
                topo.setUtilisateurId(utilisateur.getId());
                topoManager.addTopo(topo);


                return "success";
            } else {
                sitesList = siteManager.getAllSites();
                return "input";
            }
        }
        else{
            return "home";
        }
    }


}
