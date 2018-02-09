package org.oc_j2ee.projet3.business.impl.manager;

import org.oc_j2ee.projet3.business.contrat.manager.VoieManager;
import org.oc_j2ee.projet3.model.Longueur;
import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Voie;

import java.util.Iterator;
import java.util.List;

public class VoieManagerImpl extends AbstractManagerImpl implements VoieManager {


    @Override
    public void addWay(Voie voie) {
        getDaoFactory().getVoieDAO().create(voie);

    }

    @Override
    public Voie getVoie(int id) {
        Voie voie = getDaoFactory().getVoieDAO().getById(id);

        return voie;
    }



    @Override
    public List<Voie> getAllVoie() {

        List<Voie> vList = getDaoFactory().getVoieDAO().getListVoie();
        Iterator<Voie> iterator = vList.iterator();
        while(iterator.hasNext()){
            Voie voie = iterator.next();
            List<Longueur> longueurs = getDaoFactory().getLongueurDAO().getByWay(voie);
            voie.setLongueurs(longueurs);
        }
        return vList;


    }

    @Override
    public List<Voie> getVoieByName(String nom) {

        List<Voie> voies = getDaoFactory().getVoieDAO().getByName(nom);

        Iterator<Voie> iterator = voies.iterator();
        while (iterator.hasNext()){
            Voie voie = iterator.next();
            Secteur secteur = getDaoFactory().getSecteurDAO().getById(voie.getSecteur_id());
            voie.setSecteur(secteur);
            List<Longueur> longueurs = getDaoFactory().getLongueurDAO().getByWay(voie);
            voie.setLongueurs(longueurs);
        }

        return voies;
    }

}
