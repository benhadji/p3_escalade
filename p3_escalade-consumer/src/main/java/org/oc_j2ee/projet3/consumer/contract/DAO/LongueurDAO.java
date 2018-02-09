package org.oc_j2ee.projet3.consumer.contract.DAO;

import org.oc_j2ee.projet3.model.Longueur;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Voie;

import java.util.List;

public interface LongueurDAO {

    void create(Longueur longueur);
    Longueur getById(int id);
    List<Longueur> getByWay(Voie voie);
    List<Longueur> getAllLongueur();
    List<Longueur> getByName(String nom);
}
