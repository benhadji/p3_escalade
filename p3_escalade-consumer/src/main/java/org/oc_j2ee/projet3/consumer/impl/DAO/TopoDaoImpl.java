package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.TopoDAO;
import org.oc_j2ee.projet3.consumer.impl.RowMapper.TopoRM;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Topo;
import org.oc_j2ee.projet3.model.Utilisateur;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

public class TopoDaoImpl extends AbstractDaoImpl implements TopoDAO{

    @Inject
    private TopoRM topoRM;


    @Override
    public void create(Topo topo) {

    }

    @Override
    public void createBorrowing(Topo topo, Date startDate, Date endDate, Utilisateur utilisateur) {

    }

    @Override
    public void update(Topo topo) {

    }

    @Override
    public void delete(Topo topo) {

    }

    @Override
    public void deleteSiteTopo(Topo topo, Site site) {

    }

    @Override
    public Topo getById(int id) {
        return null;
    }

    @Override
    public List<Topo> listTopo() {
        return null;
    }

    @Override
    public List<Topo> getToposByUser(Utilisateur utilisateur) {
        return null;
    }

    @Override
    public List<Topo> getToposBorrowedByUser(Utilisateur user) {
        return null;
    }
}
