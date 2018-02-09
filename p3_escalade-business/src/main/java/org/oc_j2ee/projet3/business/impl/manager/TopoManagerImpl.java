package org.oc_j2ee.projet3.business.impl.manager;

import org.oc_j2ee.projet3.business.contrat.manager.SiteManager;
import org.oc_j2ee.projet3.business.contrat.manager.TopoManager;
import org.oc_j2ee.projet3.model.Site;
import org.oc_j2ee.projet3.model.Topo;
import org.oc_j2ee.projet3.model.Utilisateur;
import org.springframework.dao.EmptyResultDataAccessException;

import javax.inject.Named;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Named
public class TopoManagerImpl extends AbstractManagerImpl implements TopoManager {


    @Override
    public void addTopo(Topo topo) {
        getDaoFactory().getTopoDAO().create(topo);
    }


    @Override
    public Topo getTopo(int id) {

        Topo topo = getDaoFactory().getTopoDAO().getById(id);
        Utilisateur utilisateur = getDaoFactory().getUtilisateurDAO().getById(topo.getUtilisateurId());

        topo.setUtilisateur(utilisateur);

        return topo;
    }

    @Override
    public List<Topo> getUserTopo(Utilisateur utilisateur) {

        try{
            List<Topo> topos = getDaoFactory().getTopoDAO().getToposByUser(utilisateur);

            return topos;
        }catch (EmptyResultDataAccessException e)
        {
            return null;
        }
    }


    @Override
    public List<Topo> getAllTopo() {
        List<Topo> topos = getDaoFactory().getTopoDAO().getAllTopos();
        return topos;
    }


    @Override
    public void editTopo(Topo topo) {
        getDaoFactory().getTopoDAO().update(topo);
    }


    @Override
    public void borrowTopo(Topo topo, Date startDate, Date endDate, Map<String, Object> session) {
        getDaoFactory().getTopoDAO().createNewBorrow(topo, startDate, endDate, (Utilisateur) session.get("sessionUtilisateur"));
    }

    @Override
    public List<Topo> getTopoByName(String nom) {

        List<Topo> topos = getDaoFactory().getTopoDAO().getByName(nom);

        Iterator<Topo> iterator = topos.iterator();
        while (iterator.hasNext()){
            Topo topo = iterator.next();
            Site site = getDaoFactory().getSiteDAO().getById(topo.getSiteId());
            topo.setSite(site);
            Utilisateur utilisateur = getDaoFactory().getUtilisateurDAO().getById(topo.getUtilisateurId());
            topo.setUtilisateur(utilisateur);
        }

        return topos;
    }
}
