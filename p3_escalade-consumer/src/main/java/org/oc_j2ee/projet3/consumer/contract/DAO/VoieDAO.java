package org.oc_j2ee.projet3.consumer.contract.DAO;

import org.oc_j2ee.projet3.model.Secteur;
import org.oc_j2ee.projet3.model.Voie;

import java.util.List;

public interface VoieDAO {

    void create(Voie voie);
    void update(Voie voie);
    void delete(Voie voie);
    void deleteAllBySector(Secteur secteur);
    Voie getById(int id);
    List<Voie> getAllBySector(Secteur secteur);
    List<Voie> getListVoie();



}
