package org.oc_j2ee.projet3.business.impl.manager;

import org.oc_j2ee.projet3.business.contrat.manager.SiteManager;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Utilisateur;

import javax.inject.Named;
import java.util.List;

@Named
public class SiteManagerImpl extends AbstractManagerImpl implements SiteManager {
    @Override
    public Site getSite(int id) {
        return null;
    }

    @Override
    public List<Site> getCreatorSites(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public List<Site> getAllSites() {
        return null;
    }

    @Override
    public void addSite(Site site) {

    }

    @Override
    public Site updateSite(Site site) {
        return null;
    }

    @Override
    public void deleteSite(int id) {

    }
}
