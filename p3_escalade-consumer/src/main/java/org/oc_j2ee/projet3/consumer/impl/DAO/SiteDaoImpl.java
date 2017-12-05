package org.oc_j2ee.projet3.consumer.impl.DAO;

import org.oc_j2ee.projet3.consumer.contract.DAO.SiteDAO;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Topo;

import java.util.List;

public class SiteDaoImpl extends AbstractDaoImpl implements SiteDAO {
    @Override
    public void create(Site site) {

    }

    @Override
    public void createSiteTopo(Site site, Topo topo) {

    }

    @Override
    public void update(Site site) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void deleteSiteTopo(Site site) {

    }

    @Override
    public Site getById(int id) {
        return null;
    }

    @Override
    public List<Site> getAllSites() {
        return null;
    }

    @Override
    public List<Site> getAllByTopo(Topo topo) {
        return null;
    }
}
