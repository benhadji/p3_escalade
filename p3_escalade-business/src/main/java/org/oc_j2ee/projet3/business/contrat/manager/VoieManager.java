package org.oc_j2ee.projet3.business.contrat.manager;

import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Voie;

import java.util.List;

public interface VoieManager {

    void deleteWay(Voie voie);
    void updateWay(Voie voie);
    void addWay(Voie voie);
    Voie getVoie(int id);
    List<Voie> getVoieBySecteur(Secteur secteur);
    List<Voie> getAllBySite(Site site);
    List<Voie> getAllVoie();



}
