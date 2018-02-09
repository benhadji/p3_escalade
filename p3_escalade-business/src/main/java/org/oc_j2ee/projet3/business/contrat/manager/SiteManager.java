package org.oc_j2ee.projet3.business.contrat.manager;

import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Topo;
import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.List;

public interface SiteManager {

    Site getSite(int id);
    List<Site> getAllSites();
    void addSite(Site site);
    List<Site> getSiteByName(String nom);
    List<Site> getSitesByTopo(Topo topo);
}
