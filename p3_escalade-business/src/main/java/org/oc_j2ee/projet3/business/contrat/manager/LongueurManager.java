package org.oc_j2ee.projet3.business.contrat.manager;

import org.oc_j2ee.projet3.model.Longueur;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Voie;

import java.util.List;

public interface LongueurManager {

    void create(Longueur longueur);
    void update(Longueur longueur);
    void delete(Longueur longueur);
    void deleteAllByVoie(Voie voie);
    Longueur getById(int id);
    List<Longueur> getAllByVoie(Voie voie);
    List<Longueur> getAllBySite(Site site);
    List<Longueur> getAllLongueur();


}
