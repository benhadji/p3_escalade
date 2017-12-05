package org.oc_j2ee.projet3.business.contrat.manager;

import org.oc_j2ee.projet3.model.Topo;
import org.oc_j2ee.projet3.model.Utilisateur;

import java.util.Date;
import java.util.List;

public interface TopoManager {

    void addTopo(Topo topo);
    Topo getTopo(int id);
    List<Topo> getUserTopo(Utilisateur utilisateur);
    List<Topo> getTopoToBorrow(Utilisateur utilisateur);
    List<Topo> getAllTopo();
    void deleteTopo(int id);
    void editTopo(Topo topo);
    String borrowTopo (Topo topo, Date startDate, Date endDate);


}
