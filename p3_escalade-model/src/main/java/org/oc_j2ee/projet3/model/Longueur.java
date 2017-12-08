package org.oc_j2ee.projet3.model;

public class Longueur extends Voie{


	private Integer longueur_id;
	private Integer voie_id;
	private String nom;
	private String cotation;


	public Integer getVoie_id() {
		return voie_id;
	}

	public void setVoie_id(Integer voie_id) {
		this.voie_id = voie_id;
	}

	public Integer getId() {
		return longueur_id;
	}

	public void setId(Integer id) {
		this.longueur_id = id;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCotation() {
		return cotation;
	}
	public void setCotation(String cotation) {
		this.cotation = cotation;
	}
	
	

}
