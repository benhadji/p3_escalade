package org.oc_j2ee.projet3.business.contrat.manager;

import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.List;

public interface SiteManager {

    Site getSite(int id);
    List<Site> getCreatorSites(Utilisateur utilisateur);
    List<Site> getAllSites();
    void addSite(Site site);
    Site updateSite(Site site);
    void deleteSite(int id);

}
