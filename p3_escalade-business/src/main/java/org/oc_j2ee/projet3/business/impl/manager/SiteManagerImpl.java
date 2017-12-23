package org.oc_j2ee.projet3.business.impl.manager;

import org.oc_j2ee.projet3.business.contrat.manager.SiteManager;
import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Utilisateur;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Named
public class SiteManagerImpl extends AbstractManagerImpl implements SiteManager {
    @Override
    public Site getSite(int id) {
        return getDaoFactory().getSiteDAO().getById(id);
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
}
