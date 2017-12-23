package org.oc_j2ee.projet3.business.contrat.manager;

import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Site;

import java.util.List;

public interface SecteurManager {

    Secteur getSecteur(int id);
    List<Secteur> getAllSecteursBySite(Site site);
    List<Secteur> getAllSecteurs();
    void deleteSecteur(Secteur secteur);
    void updateSecteur(Secteur secteur);
    void addSecteur(Secteur secteur);


}
