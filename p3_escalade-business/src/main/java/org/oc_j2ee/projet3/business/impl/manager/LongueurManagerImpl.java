package org.oc_j2ee.projet3.business.impl.manager;

import org.oc_j2ee.projet3.business.contrat.manager.LongueurManager;
import org.oc_j2ee.projet3.model.Longueur;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Voie;

import java.util.Iterator;
import java.util.List;

public class LongueurManagerImpl extends AbstractManagerImpl implements LongueurManager {
    @Override
    public void create(Longueur longueur) {
        getDaoFactory().getLongueurDAO().create(longueur);

    }




    @Override
    public Longueur getById(int id) {
        Longueur longueur = getDaoFactory().getLongueurDAO().getById(id);

        return longueur;
    }



    @Override
    public List<Longueur> getAllLongueur() {

        List<Longueur> vList = getDaoFactory().getLongueurDAO().getAllLongueur();

        return vList;



    }

    @Override
    public List<Longueur> getLongueurByName(String nom) {
        List<Longueur> longueurs = getDaoFactory().getLongueurDAO().getByName(nom);

        Iterator<Longueur> iterator = longueurs.iterator();
        while (iterator.hasNext()){
            Longueur longueur = iterator.next();
            Voie voie = getDaoFactory().getVoieDAO().getById(longueur.getVoie_id());
            longueur.setVoie(voie);
        }

        return longueurs;
    }
}
