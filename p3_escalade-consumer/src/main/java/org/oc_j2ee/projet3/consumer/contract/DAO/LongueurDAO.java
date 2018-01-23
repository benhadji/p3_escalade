package org.oc_j2ee.projet3.consumer.contract.DAO;

import org.oc_j2ee.projet3.model.Longueur;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Voie;

import java.util.List;

public interface LongueurDAO {

    void create(Longueur longueur);
    void update(Longueur length);
    void delete(Longueur length);
    void deleteAllByWay(Voie voie);
    Longueur getById(int id);
    List<Longueur> getByWay(Voie voie);
    List<Longueur> getBySite(Site site);
    List<Longueur> getAllLongueur();


    List<Longueur> getByName(String nom);
}
