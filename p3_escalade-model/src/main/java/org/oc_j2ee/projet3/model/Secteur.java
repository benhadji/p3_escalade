package org.oc_j2ee.projet3.model;

import java.util.ArrayList;
import java.util.List;

public class Secteur extends Site {


    private Integer secteur_id;
    private Integer site_id;
	private String nom;
    private List<Voie> voies = new ArrayList<Voie>();
    private Site site;

    public List<Voie> getVoies() {
        return voies;
    }

    public void setVoies(List<Voie> voies) {
        this.voies = voies;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Integer getSite_id() {
        return site_id;
    }

    public void setSite_id(Integer site_id) {
        this.site_id = site_id;
    }

    public Integer getSecteur_id() {
        return secteur_id;
    }

    public void setSecteur_id(Integer secteur_id) {
        this.secteur_id = secteur_id;
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
