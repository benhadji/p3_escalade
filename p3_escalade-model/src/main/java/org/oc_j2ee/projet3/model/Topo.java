package org.oc_j2ee.projet3.model;

public class Topo {

	private Integer id;
	private Integer siteId;
	private Integer utilisateurId;
	private String nom;
	private boolean emprunt;




	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSiteId() {
		return siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	public Integer getUtilisateurId() {
		return utilisateurId;
	}

	public void setUtilisateurId(Integer utilisateurId) {
		this.utilisateurId = utilisateurId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isEmprunt() {
		return emprunt;
	}

	public void setEmprunt(boolean emprunt) {
		this.emprunt = emprunt;
	}


}
