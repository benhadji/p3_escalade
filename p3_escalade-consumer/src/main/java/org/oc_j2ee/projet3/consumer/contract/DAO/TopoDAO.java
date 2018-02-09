package org.oc_j2ee.projet3.consumer.contract.DAO;

import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Topo;
import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.Date;
import java.util.List;

public interface TopoDAO {

    void create(Topo topo);
    void update (Topo topo);
    void createNewBorrow(Topo topo, Date startDate, Date endDate, Utilisateur utilisateur);
    Topo getById(int id);
    List<Topo> getAllTopos();
    List<Topo> getToposByUser(Utilisateur utilisateur);
    List<Topo> getByName(String nom);
}
