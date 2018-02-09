package org.oc_j2ee.projet3.consumer.contract.DAO;

import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Voie;

import java.util.List;

public interface VoieDAO {

    void create(Voie voie);
    Voie getById(int id);
    List<Voie> getAllBySector(Secteur secteur);
    List<Voie> getListVoie();
    List<Voie> getByName(String nom);
}
