package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;
import org.apache.struts2.interceptor.SessionAware;
import org.oc_j2ee.projet3.business.contrat.manager.SiteManager;
import org.oc_j2ee.projet3.business.contrat.manager.TopoManager;
import org.oc_j2ee.projet3.model.Borrow;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Topo;
import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class BorrowTopoAction extends ActionSupport implements SessionAware{

    private Topo topo;
    private Borrow borrow;
    private List<Borrow> borrows = new ArrayList<>();
    private Utilisateur utilisateur;
    private TopoManager topoManager;
    private SiteManager siteManager;
    private Date startdate;
    private Date enddate;
    private Map<String, Object> session;
    private String idTopo;
    private List<Site> sites = new ArrayList<>();

    public SiteManager getSiteManager() {
        return siteManager;
    }

    public void setSiteManager(SiteManager siteManager) {
        this.siteManager = siteManager;
    }

    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    public Borrow getBorrow() {
        return borrow;
    }

    public void setBorrow(Borrow borrow) {
        this.borrow = borrow;
    }

    public List<Borrow> getBorrows() {
        return borrows;
    }

    public void setBorrows(List<Borrow> borrows) {
        this.borrows = borrows;
    }

    public TopoManager getTopoManager() {
        return topoManager;
    }

    public void setTopoManager(TopoManager topoManager) {
        this.topoManager = topoManager;
    }

    public String getIdTopo() {
        return idTopo;
    }

    public void setIdTopo(String idTopo) {
        this.idTopo = idTopo;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }


    public Date getStartdate() {
        return startdate;
    }



    @TypeConversion(converter = "org.oc_j2ee.projet3.webapp.converter.StringToDateConverter")
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    @TypeConversion(converter = "org.oc_j2ee.projet3.webapp.converter.StringToDateConverter")
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    @Override
    public void setSession(Map<String, Object> session) {

        this.session = session;

    }


    public String execute() throws Exception {

        if(session.containsKey("sessionUtilisateur")) {

            if(startdate!=null && enddate!=null){

                topo = topoManager.getTopo(Integer.parseInt(idTopo));

                Utilisateur utilisateur = (Utilisateur) session.get("sessionUtilisateur");
                topo.setUtilisateurId(utilisateur.getId());

                topoManager.borrowTopo(topo, startdate, enddate, session);

                addActionMessage("Le pret du topo " + topo.getNom() + " a ete correctement enregistré !!");


                return "success";
            }
            else{

                topo = topoManager.getTopo(Integer.parseInt(idTopo));
                sites = siteManager.getSitesByTopo(topo);

                return "input";
            }
        }
        else
        {
            return "login";
        }

    }


}
