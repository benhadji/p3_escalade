package org.oc_j2ee.projet3.business.contrat.manager;

import org.oc_j2ee.projet3.model.Longueur;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Voie;

import java.util.List;

public interface LongueurManager {

    void create(Longueur longueur);
    Longueur getById(int id);
    List<Longueur> getAllLongueur();
    List<Longueur> getLongueurByName(String nom);
}
