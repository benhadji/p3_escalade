package org.oc_j2ee.projet3.model;

public class Longueur {


	private Integer longueur_id;
	private Integer voie_id;
	private String nom;
    private String cotation;
    private Voie voie;


	public Voie getVoie() {
		return voie;
	}

	public void setVoie(Voie voie) {
		this.voie = voie;
	}

	public Integer getLongueur_id() {
		return longueur_id;
	}

	public void setLongueur_id(Integer longueur_id) {
		this.longueur_id = longueur_id;
	}

	public Integer getVoie_id() {
		return voie_id;
	}

	public void setVoie_id(Integer voie_id) {
		this.voie_id = voie_id;
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
