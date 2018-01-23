package org.oc_j2ee.projet3.consumer.contract.DAO;

import org.oc_j2ee.projet3.model.Site;

import java.util.List;

public interface SiteDAO {

    void create(Site site);
    void update(Site site);
    void delete(int id);
    Site getById(int id);
    List<Site> getAllSites();
    List<String> getAllSitesNames();
    List<Site> getByName(String nom);


    String getSiteNameFromId(Integer siteId);
}
