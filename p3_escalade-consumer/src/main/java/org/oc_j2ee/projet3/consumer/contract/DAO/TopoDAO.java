package org.oc_j2ee.projet3.consumer.contract.DAO;

import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Topo;
import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.Date;
import java.util.List;

public interface TopoDAO {

    void create(Topo topo);
    void createBorrowing(Topo topo, Date startDate, Date endDate, Utilisateur utilisateur);
    void update (Topo topo);
    void delete (Topo topo);
    void deleteSiteTopo (Topo topo, Site site);
    Topo getById(int id);
    List<Topo> listTopo();
    List<Topo> getToposByUser(Utilisateur utilisateur);
    List<Topo> getToposBorrowedByUser (Utilisateur user);

}
