package org.oc_j2ee.projet3.consumer.contract.DAO;

import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Site;

import java.util.List;

public interface SecteurDAO {

    void create(Secteur sector);
    void update(Secteur sector);
    void delete(Secteur sector);
    void deleteAllBySite(Site site);
    Secteur getById(int id);
    List<Secteur> getAllBySite(Site site);
    List<Secteur> getAllSecteurs();


}
