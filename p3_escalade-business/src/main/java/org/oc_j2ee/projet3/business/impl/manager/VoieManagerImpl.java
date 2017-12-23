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
    public void deleteWay(Voie voie) {
        getDaoFactory().getVoieDAO().delete(voie);
    }

    @Override
    public void updateWay(Voie voie) {
        getDaoFactory().getVoieDAO().update(voie);

    }

    @Override
    public void addWay(Voie voie) {
        getDaoFactory().getVoieDAO().create(voie);

    }

    @Override
    public Voie getVoie(int id) {
        return getDaoFactory().getVoieDAO().getById(id);
    }

    @Override
    public List<Voie> getVoieBySecteur(Secteur secteur) {
        return getDaoFactory().getVoieDAO().getAllBySector(secteur);
    }

    @Override
    public List<Voie> getAllBySite(Site site) {
        return getDaoFactory().getVoieDAO().getAllBySite(site);
    }

    @Override
    public List<Voie> getAllVoie() {
        //return getDaoFactory().getVoieDAO().getListVoie();

        List<Voie> vList = getDaoFactory().getVoieDAO().getListVoie();
        Iterator<Voie> iterator = vList.iterator();
        while(iterator.hasNext()){
            Voie voie = iterator.next();
            List<Longueur> longueurs = getDaoFactory().getLongueurDAO().getByWay(voie);
            voie.setLongueurs(longueurs);
        }
        return vList;


    }
}
