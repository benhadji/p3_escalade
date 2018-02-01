package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.oc_j2ee.projet3.business.contrat.manager.BorrowManager;
import org.oc_j2ee.projet3.business.contrat.manager.TopoManager;
import org.oc_j2ee.projet3.business.contrat.manager.UtilisateurManager;
import org.oc_j2ee.projet3.model.Borrow;
import org.oc_j2ee.projet3.model.Topo;
import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.ArrayList;
import java.util.List;


public class ListeBorrowAction extends ActionSupport {

    private Borrow borrow;
    private BorrowManager borrowManager;
    private UtilisateurManager utilisateurManager;
    private TopoManager topoManager;
    private List<Borrow> borrows = new ArrayList<>();
    private Utilisateur utilisateur;
    private Topo topo;
    private String userName;
    private String topoName;

    public UtilisateurManager getUtilisateurManager() {
        return utilisateurManager;
    }

    public void setUtilisateurManager(UtilisateurManager utilisateurManager) {
        this.utilisateurManager = utilisateurManager;
    }

    public TopoManager getTopoManager() {
        return topoManager;
    }

    public void setTopoManager(TopoManager topoManager) {
        this.topoManager = topoManager;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTopoName() {
        return topoName;
    }

    public void setTopoName(String topoName) {
        this.topoName = topoName;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public Borrow getBorrow() {
        return borrow;
    }

    public void setBorrow(Borrow borrow) {
        this.borrow = borrow;
    }

    public BorrowManager getBorrowManager() {
        return borrowManager;
    }

    public void setBorrowManager(BorrowManager borrowManager) {
        this.borrowManager = borrowManager;
    }

    public List<Borrow> getBorrows() {
        return borrows;
    }

    public void setBorrows(List<Borrow> borrows) {
        this.borrows = borrows;
    }


    public String execute(){
        borrows = borrowManager.getBorrowList();
        for (Borrow borrow : borrows){
            System.out.println(borrow.getId());

            Utilisateur utilisateur = utilisateurManager.displayUser(borrow.getUtilisateurId());
            System.out.println(utilisateur.getNom());

            Topo topo = topoManager.getTopo(borrow.getTopoId());
            System.out.println(topo.getNom());




        }

        return "success";

    }
}
