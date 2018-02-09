package org.oc_j2ee.projet3.model;

import java.util.ArrayList;
import java.util.List;

public class Site extends Topo {


	private Integer site_id;
	private String nom;
	private String localisation;
	private List<Secteur> secteurs = new ArrayList<Secteur>();


	public List<Secteur> getSecteurs() {
		return secteurs;
	}
	public void setSecteurs(List<Secteur> secteurs) {
		this.secteurs = secteurs;
	}
	public Integer getSite_id() {
		return site_id;
	}
	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	
	

}
