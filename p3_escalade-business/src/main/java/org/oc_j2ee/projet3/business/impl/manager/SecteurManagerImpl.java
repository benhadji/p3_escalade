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

        Secteur secteur = getDaoFactory().getSecteurDAO().getById(id);
        Site site = getDaoFactory().getSiteDAO().getById(secteur.getSite_id());

        secteur.setSite(site);

        return secteur;
    }

    @Override
    public List<Secteur> getAllSecteurs() {

        List<Secteur> vList = getDaoFactory().getSecteurDAO().getAllSecteurs();
        Iterator<Secteur> iterator = vList.iterator();
        while(iterator.hasNext()){
            Secteur secteur = iterator.next();
            List<Voie> voies = getDaoFactory().getVoieDAO().getAllBySector(secteur);
            secteur.setVoies(voies);
        }
        return vList;


    }

    @Override
    public List<Secteur> getSectorByName(String nom) {

        List<Secteur> secteurs = getDaoFactory().getSecteurDAO().getByName(nom);

        Iterator<Secteur> iterator = secteurs.iterator();
        while (iterator.hasNext()){
            Secteur secteur = iterator.next();
            Site site = getDaoFactory().getSiteDAO().getById(secteur.getSite_id());
            secteur.setSite(site);
            List<Voie> voies = getDaoFactory().getVoieDAO().getAllBySector(secteur);
            secteur.setVoies(voies);
        }

        return secteurs;

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

    @Override
    public String getNameFromId(Integer secteurId) {
        String name = getDaoFactory().getSecteurDAO().getNameFromId(secteurId);

        return name;
    }

    @Override
    public String getNameFromVoie(Voie voie) {
        String name = getDaoFactory().getSecteurDAO().getNameFromVoie(voie);

        return name;
    }
}
