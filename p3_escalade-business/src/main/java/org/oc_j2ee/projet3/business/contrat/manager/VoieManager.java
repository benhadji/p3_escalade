package org.oc_j2ee.projet3.business.contrat.manager;

import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Voie;

import java.util.List;

public interface VoieManager {


    void addWay(Voie voie);
    Voie getVoie(int id);
    List<Voie> getAllVoie();
    List<Voie> getVoieByName(String nom);

}
