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

public class EditTopoFormAction extends ActionSupport implements SessionAware {


    private Topo topo;
    private TopoManager topoManager;
    private List<Site> sitesList = new ArrayList<>();
    private Map<String, Object> session;
    private SiteManager siteManager;
    private String yourChoice;
    private ArrayList<String> yourChoiceList = new ArrayList<>();
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public ArrayList<String> getYourChoiceList() {
        return yourChoiceList;
    }

    public void setYourChoiceList(ArrayList<String> yourChoiceList) {
        this.yourChoiceList = yourChoiceList;
    }

    public TopoManager getTopoManager() {
        return topoManager;
    }

    public void setTopoManager(TopoManager topoManager) {
        this.topoManager = topoManager;
    }

    public SiteManager getSiteManager() {
        return siteManager;
    }

    public void setSiteManager(SiteManager siteManager) {
        this.siteManager = siteManager;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

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

    public void setYourChoice(String yourChoice) {
        this.yourChoice = yourChoice;
    }

    public String getYourChoice() {
        return yourChoice;
    }



    public String execute(){

        yourChoiceList.add("Rendre Dispo");
        yourChoiceList.add("Rendre Indispo");

        if(session.containsKey("sessionUtilisateur")) {


            if (topo != null) {

                topo.setId(Integer.parseInt(id));

                Utilisateur utilisateur = (Utilisateur) session.get("sessionUtilisateur");
                topo.setUtilisateurId(utilisateur.getId());

                if(yourChoice.equalsIgnoreCase("Rendre Indispo")){
                    topo.setEmprunt(true);
                }
                else {
                    topo.setEmprunt(false);
                }


                topoManager.editTopo(topo);

                System.out.println("Le nouveau topo est : " +
                        "\nTopo id : " + topo.getId() +
                        "\nTopo new name : " + topo.getNom() +
                        "\nTopo new site : " + topo.getSiteId() +
                        "\nTopo new status : " + topo.isEmprunt());
                return "success";
            } else {

                topo = topoManager.getTopo(Integer.parseInt(id));
                System.out.println("Le nouveau topo est : " +
                        "\nTopo id : " + topo.getId() +
                        "\nTopo old name : " + topo.getNom() +
                        "\nTopo old site : " + topo.getSiteId() +
                        "\nTopo old status : " + topo.isEmprunt());
                sitesList = siteManager.getAllSites();
                return "input";
            }
        }
        else{
            return "home";
        }
    }



}
