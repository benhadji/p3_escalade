package org.oc_j2ee.projet3.business.impl.manager;

import org.oc_j2ee.projet3.business.contrat.manager.SiteManager;
import org.oc_j2ee.projet3.business.contrat.manager.TopoManager;
import org.oc_j2ee.projet3.model.Topo;
import org.oc_j2ee.projet3.model.Utilisateur;

import javax.inject.Named;
import java.util.Date;
import java.util.List;

@Named
public class TopoManagerImpl extends AbstractManagerImpl implements TopoManager {
    @Override
    public void addTopo(Topo topo) {

    }

    @Override
    public Topo getTopo(int id) {
        return null;
    }

    @Override
    public List<Topo> getUserTopo(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public List<Topo> getTopoToBorrow(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public List<Topo> getAllTopo() {
        return null;
    }

    @Override
    public void deleteTopo(int id) {

    }

    @Override
    public void editTopo(Topo topo) {

    }

    @Override
    public String borrowTopo(Topo topo, Date startDate, Date endDate) {
        return null;
    }
}
