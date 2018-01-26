package org.oc_j2ee.projet3.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.oc_j2ee.projet3.business.contrat.manager.TopoManager;
import org.oc_j2ee.projet3.model.Topo;

import java.util.ArrayList;
import java.util.List;

public class ListeTopoAction extends ActionSupport {

    private Topo topo;
    private TopoManager topoManager;
    private List<Topo> topos = new ArrayList<>();


    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public TopoManager getTopoManager() {
        return topoManager;
    }

    public void setTopoManager(TopoManager topoManager) {
        this.topoManager = topoManager;
    }

    public List<Topo> getTopos() {
        return topos;
    }

    public void setTopos(List<Topo> topos) {
        this.topos = topos;
    }

    public String execute(){
        topos = topoManager.getAllTopo();
        return "success";

    }




}
