package org.oc_j2ee.projet3.business.impl.manager;

import org.oc_j2ee.projet3.business.contrat.manager.SiteManager;
import org.oc_j2ee.projet3.model.*;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Named
public class SiteManagerImpl extends AbstractManagerImpl implements SiteManager {

    @Override
    public Site getSite(int id) {
        Site site = getDaoFactory().getSiteDAO().getById(id);
        List<Secteur> secteurs = getDaoFactory().getSecteurDAO().getAllBySite(site);
        site.setSecteurs(secteurs);

        return site;

    }

    @Override
    public List<Site> getSiteByName(String nom) {

        List<Site> sites = getDaoFactory().getSiteDAO().getByName(nom);
        Iterator<Site> iterator = sites.iterator();
        while (iterator.hasNext()){
            Site site = iterator.next();
            List<Secteur> secteurs = getDaoFactory().getSecteurDAO().getAllBySite(site);
            site.setSecteurs(secteurs);
        }

        return sites;

    }

    @Override
    public String getNameFromId(Integer siteId) {
        String name = getDaoFactory().getSiteDAO().getSiteNameFromId(siteId);
        return name;
    }

    @Override
    public List<Site> getCreatorSites(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public List<Site> getAllSites() {

        List<Site> vList = getDaoFactory().getSiteDAO().getAllSites();
        Iterator<Site> iterator = vList.iterator();
        while(iterator.hasNext()){
            Site site = iterator.next();
            List<Secteur> secteurs = getDaoFactory().getSecteurDAO().getAllBySite(site);
            site.setSecteurs(secteurs);
        }
        return vList;
    }

    @Override
    public void addSite(Site site) {

        getDaoFactory().getSiteDAO().create(site);

    }

    @Override
    public Site updateSite(Site site) {
        return null;
    }

    @Override
    public void deleteSite(int id) {

    }

    @Override
    public List<String> getAllSiteName() {

        return getDaoFactory().getSiteDAO().getAllSitesNames();
    }


}
