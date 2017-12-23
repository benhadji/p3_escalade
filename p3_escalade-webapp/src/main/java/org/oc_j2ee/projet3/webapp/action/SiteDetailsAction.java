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
import java.util.List;

public class SiteDetailsAction extends ActionSupport {

    private SiteManager siteManager;
    private SecteurManager secteurManager;
    private VoieManager voieManager;
    private LongueurManager longueurManager;

    private Site site;
    private Secteur secteur;
    private Voie voie;
    private Longueur longueur;

    private Integer site_id;
    private Integer secteur_id;
    private Integer voie_id;
    private Integer longueur_id;

    private List<Secteur> secteurs = new ArrayList<>();
    private List<Voie> voies = new ArrayList<>();
    private List<Longueur> longueurs = new ArrayList<>();


// ******************************************* Manager ************************************** //
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



// ******************************************* Model ************************************** //
    public Site getSite() {
        return site;
    }
    public void setSite(Site site) {
        this.site = site;
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


// ******************************************* ID ************************************** //

    public Integer getSite_id() {
        return site_id;
    }
    public void setSite_id(Integer site_id) {
        this.site_id = site_id;
    }

    public Integer getSecteur_id() {
        return secteur_id;
    }
    public void setSecteur_id(Integer secteur_id) {
        this.secteur_id = secteur_id;
    }

    public Integer getVoie_id() {
        return voie_id;
    }
    public void setVoie_id(Integer voie_id) {
        this.voie_id = voie_id;
    }

    public Integer getLongueur_id() {
        return longueur_id;
    }

    public void setLongueur_id(Integer longueur_id) {
        this.longueur_id = longueur_id;
    }


// ******************************************* List ************************************** //

    public void setSecteurs(List<Secteur> secteurs) {
        this.secteurs = secteurs;
    }
    public void setVoies(List<Voie> voies) {
        this.voies = voies;
    }
    public void setLongueurs(List<Longueur> longueurs) {
        this.longueurs = longueurs;
    }

    public List<Secteur> getSecteurs() {
        return secteurs;
    }


    public List<Voie> getVoies() {
        return voies;
    }

    public List<Longueur> getLongueurs() {
        return longueurs;
    }





    public String execute(){

        this.site = siteManager.getSite(this.site_id);
        secteurs = getSecteurManager().getAllSecteursBySite(this.site);
        voies = getVoieManager().getAllBySite(this.site);
        longueurs = getLongueurManager().getAllBySite(this.site);

        return "success";

    }


}
