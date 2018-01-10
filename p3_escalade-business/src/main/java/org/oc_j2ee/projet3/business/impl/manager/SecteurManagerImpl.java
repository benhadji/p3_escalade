package org.oc_j2ee.projet3.business.impl.manager;

import org.oc_j2ee.projet3.business.contrat.manager.SecteurManager;
import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Voie;

import javax.inject.Named;
import java.util.Iterator;
import java.util.List;

@Named
public class SecteurManagerImpl extends AbstractManagerImpl implements SecteurManager{

    @Override
    public Secteur getSecteur(int id) {
        return getDaoFactory().getSecteurDAO().getById(id);
    }

    @Override
    public List<Secteur> getAllSecteurs() {
        //return getDaoFactory().getSecteurDAO().getAllSecteurs();

        List<Secteur> vList = getDaoFactory().getSecteurDAO().getAllSecteurs();
        Iterator<Secteur> iterator = vList.iterator();
        while(iterator.hasNext()){
            Secteur secteur = iterator.next();
            List<Voie> voies = getDaoFactory().getVoieDAO().getAllBySector(secteur);
            secteur.setVoies(voies);
        }
        return vList;


    }


    public List<Secteur> getAllSecteursBySite(Site site) {
        return getDaoFactory().getSecteurDAO().getAllBySite(site);
    }

    @Override
    public void deleteSecteur(Secteur secteur) {

    }

    @Override
    public void updateSecteur(Secteur secteur) {

    }

    @Override
    public void addSecteur(Secteur secteur) {

        getDaoFactory().getSecteurDAO().create(secteur);

    }
}
