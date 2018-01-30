package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.oc_j2ee.projet3.business.contrat.manager.TopoManager;
import org.oc_j2ee.projet3.model.Borrow;
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
    private Date startdate;
    private Date enddate;
    private Map<String, Object> session;
    private String id;

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

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
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

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    @Override
    public void setSession(Map<String, Object> session) {

        this.session = session;

    }


    public String execute() throws Exception {

        if(topo!=null){

            topoManager.borrowTopo(topo, startdate, enddate, session);
            return "success";

        }
        else
        {
            return "input";
        }

    }


}
