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

    public List<Topo> getTopos() {
        return topos;
    }

    public void setTopos(List<Topo> topos) {
        this.topos = topos;
    }

    public TopoManager getTopoManager() {
        return topoManager;
    }

    public void setTopoManager(TopoManager topoManager) {
        this.topoManager = topoManager;
    }

    private SiteManager siteManager;
    private SecteurManager secteurManager;
    private VoieManager voieManager;
    private LongueurManager longueurManager;
    private TopoManager topoManager;

    private Site site;
    private Secteur secteur;
    private Voie voie;
    private Longueur longueur;

    private String nom;
    private String result;
    private String yourSearchItem;
    private String siteName;
    private String secteurName;
    private String voieName;
    private String cotation;

    private boolean etat;


    public String getCotation() {
        return cotation;
    }

    public void setCotation(String cotation) {
        this.cotation = cotation;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public String getSecteurName() {
        return secteurName;
    }

    public void setSecteurName(String secteurName) {
        this.secteurName = secteurName;
    }

    public String getVoieName() {
        return voieName;
    }

    public void setVoieName(String voieName) {
        this.voieName = voieName;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
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

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    public Voie getVoie() {
        return voie;
    }

    public void setVoie(Voie voie) {
        this.voie = voie;
    }

    public Longueur getLongueur() {
        return longueur;
    }

    public void setLongueur(Longueur longueur) {
        this.longueur = longueur;
    }

    public SecteurManager getSecteurManager() {
        return secteurManager;
    }

    public void setSecteurManager(SecteurManager secteurManager) {
        this.secteurManager = secteurManager;
    }

    public List<Secteur> getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(List<Secteur> secteurs) {
        this.secteurs = secteurs;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    public SiteManager getSiteManager() {
        return siteManager;
    }

    public void setSiteManager(SiteManager siteManager) {
        this.siteManager = siteManager;
    }

    public String getDefaultSearchItemValue(){
        return "Site";
    }


    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public ArrayList<String> getSearchItem() {
        return searchItem;
    }

    public void setSearchItem(ArrayList<String> searchItem) {
        this.searchItem = searchItem;
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
            setResult("Aucun nom n'a ete entré. Voici la liste des sites :\n");
            siteManager.getAllSites();
            return INPUT;
        }

    }


}