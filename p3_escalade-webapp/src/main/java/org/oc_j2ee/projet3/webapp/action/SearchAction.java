package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.oc_j2ee.projet3.business.contrat.manager.*;
import org.oc_j2ee.projet3.model.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class SearchAction extends ActionSupport {


    private ArrayList<String> searchItem = new ArrayList<>();
    private List<Site> sites = new ArrayList<Site>();
    private List<Secteur> secteurs = new ArrayList<Secteur>();
    private List<Voie> voies = new ArrayList<Voie>();
    private List<Longueur> longueurs = new ArrayList<Longueur>();
    private List<Topo> topos = new ArrayList<>();

    private SiteManager siteManager;
    private SecteurManager secteurManager;
    private VoieManager voieManager;
    private LongueurManager longueurManager;
    private TopoManager topoManager;

    private String nom;
    private String result;
    private String yourSearchItem;


    public ArrayList<String> getSearchItem() {
        return searchItem;
    }

    public void setSearchItem(ArrayList<String> searchItem) {
        this.searchItem = searchItem;
    }

    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    public List<Secteur> getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(List<Secteur> secteurs) {
        this.secteurs = secteurs;
    }

    public List<Voie> getVoies() {
        return voies;
    }

    public void setVoies(List<Voie> voies) {
        this.voies = voies;
    }

    public List<Longueur> getLongueurs() {
        return longueurs;
    }

    public void setLongueurs(List<Longueur> longueurs) {
        this.longueurs = longueurs;
    }

    public List<Topo> getTopos() {
        return topos;
    }

    public void setTopos(List<Topo> topos) {
        this.topos = topos;
    }

    public SiteManager getSiteManager() {
        return siteManager;
    }

    public void setSiteManager(SiteManager siteManager) {
        this.siteManager = siteManager;
    }

    public SecteurManager getSecteurManager() {
        return secteurManager;
    }

    public void setSecteurManager(SecteurManager secteurManager) {
        this.secteurManager = secteurManager;
    }

    public VoieManager getVoieManager() {
        return voieManager;
    }

    public void setVoieManager(VoieManager voieManager) {
        this.voieManager = voieManager;
    }

    public LongueurManager getLongueurManager() {
        return longueurManager;
    }

    public void setLongueurManager(LongueurManager longueurManager) {
        this.longueurManager = longueurManager;
    }

    public TopoManager getTopoManager() {
        return topoManager;
    }

    public void setTopoManager(TopoManager topoManager) {
        this.topoManager = topoManager;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getYourSearchItem() {
        return yourSearchItem;
    }

    public void setYourSearchItem(String yourSearchItem) {
        this.yourSearchItem = yourSearchItem;
    }

    public String execute() {

        searchItem.add("Site");
        searchItem.add("Secteur");
        searchItem.add("Voie");
        searchItem.add("Longueur");
        searchItem.add("Topo");

        if (nom != null)
        {
            if(this.yourSearchItem.equalsIgnoreCase("Site"))
            {
                sites = siteManager.getSiteByName(nom);
                if (sites == null) {
                    this.setResult("Aucun résultat n'a été trouvé pour votre recherche");
                    return ERROR;
                } else {
                    this.setResult("Il existe " + sites.size() + " résultat(s) correspondant a votre recherche");

                    return SUCCESS;
                }
            }

            if(this.yourSearchItem.equalsIgnoreCase("Secteur")){

                secteurs = secteurManager.getSectorByName(nom);
                if (secteurs == null) {
                    this.setResult("Aucun résultat n'a été trouvé pour votre recherche");
                    return ERROR;
                }
                else {
                    this.setResult("Il existe " + secteurs.size() + " résultat(s) correspondant a votre recherche");
                    for (Secteur secteur : secteurs) {
                        System.out.println(secteur.getNom());
                    }

                    return SUCCESS;
                }

            }

            if(this.yourSearchItem.equalsIgnoreCase("Voie")){

                voies = voieManager.getVoieByName(nom);
                if (voies == null) {
                    this.setResult("Aucun résultat n'a été trouvé pour votre recherche");
                    return ERROR;
                }
                else {
                    this.setResult("Il existe " + voies.size() + " résultat(s) correspondant a votre recherche");
                    for (Voie voie : voies) {
                        System.out.println(voie.getNom());
                    }
                    return SUCCESS;
                }

            }

            if(this.yourSearchItem.equalsIgnoreCase("Longueur")){

                longueurs = longueurManager.getLongueurByName(nom);
                if (longueurs == null) {
                    this.setResult("Aucun résultat n'a été trouvé pour votre recherche");
                    return ERROR;
                }
                else {
                    this.setResult("Il existe " + longueurs.size() + " résultat(s) correspondant a votre recherche");

                    for (Longueur longueur : longueurs) {
                        System.out.println(longueur.getNom());
                    }

                    return SUCCESS;
                }

            }

            if(this.yourSearchItem.equalsIgnoreCase("Topo")){

                topos = topoManager.getTopoByName(nom);
                if (topos == null) {
                    this.setResult("Aucun résultat n'a été trouvé pour votre recherche");
                    return ERROR;
                }
                else {
                    this.setResult("Il existe " + topos.size() + " résultat(s) correspondant a votre recherche");
                    for (Topo topo : topos) {
                        System.out.println(topo.getNom());
                    }

                    return SUCCESS;
                }

            }

            else
                return "home";

        } else {
            setResult("Aucun nom n'a ete entré");

            return INPUT;
        }

    }


}