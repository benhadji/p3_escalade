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
import java.util.Iterator;
import java.util.List;


public class SearchAction extends ActionSupport {


    private ArrayList<String> searchItem = new ArrayList<>();
    private List<Site> sites = new ArrayList<Site>();
    private List<Secteur> secteurs = new ArrayList<Secteur>();
    private List<Secteur> nbSecteurs = new ArrayList<Secteur>();
    private List<String> secteurNames = new ArrayList<String>();
    private List<Voie> voies = new ArrayList<Voie>();
    private List<Voie> nbVoies = new ArrayList<Voie>();
    private List<Longueur> longueurs = new ArrayList<Longueur>();
    private List<Longueur> nbLongueurs = new ArrayList<Longueur>();

    private SiteManager siteManager;
    private SecteurManager secteurManager;
    private VoieManager voieManager;
    private LongueurManager longueurManager;

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

    public List<String> getSecteurNames() {
        return secteurNames;
    }

    public void setSecteurNames(List<String> secteurNames) {
        this.secteurNames = secteurNames;
    }

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

    public List<Longueur> getNbLongueurs() {
        return nbLongueurs;
    }

    public void setNbLongueurs(List<Longueur> nbLongueurs) {
        this.nbLongueurs = nbLongueurs;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public List<Secteur> getNbSecteurs() {
        return nbSecteurs;
    }

    public void setNbSecteurs(List<Secteur> nbSecteurs) {
        this.nbSecteurs = nbSecteurs;
    }

    public List<Voie> getNbVoies() {
        return nbVoies;
    }

    public void setNbVoies(List<Voie> nbVoies) {
        this.nbVoies = nbVoies;
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
                    for (Site site : sites) {
                        System.out.println(site.getNom());
                    }
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

                    //cotation = longueur.getCotation();

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