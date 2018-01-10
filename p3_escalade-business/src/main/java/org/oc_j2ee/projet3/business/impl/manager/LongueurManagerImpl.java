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
    public void update(Longueur longueur) {

    }

    @Override
    public void delete(Longueur longueur) {

    }

    @Override
    public void deleteAllByVoie(Voie voie) {

    }

    @Override
    public Longueur getById(int id) {
        return getDaoFactory().getLongueurDAO().getById(id);
    }

    @Override
    public List<Longueur> getAllByVoie(Voie voie) {
        return getDaoFactory().getLongueurDAO().getByWay(voie);
    }

    @Override
    public List<Longueur> getAllBySite(Site site) {
        return getDaoFactory().getLongueurDAO().getBySite(site);
    }

    @Override
    public List<Longueur> getAllLongueur() {

        List<Longueur> vList = getDaoFactory().getLongueurDAO().getAllLongueur();

        return vList;



    }
}
