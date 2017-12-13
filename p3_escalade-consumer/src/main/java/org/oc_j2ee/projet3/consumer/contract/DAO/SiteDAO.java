package org.oc_j2ee.projet3.consumer.contract.DAO;

import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Topo;

import java.util.List;

public interface SiteDAO {

    void create(Site site);
    void update(Site site);
    void delete(int id);
    Site getById(int id);


}
