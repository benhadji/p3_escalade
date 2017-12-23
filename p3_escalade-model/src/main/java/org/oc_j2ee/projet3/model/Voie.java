package org.oc_j2ee.projet3.model;

import java.util.ArrayList;
import java.util.List;

public class Voie extends Longueur {


	private Integer voie_id;
	private Integer secteur_id;
	private String nom;
	private boolean etat;
    private List<Longueur> longueurs = new ArrayList<Longueur>();

    public List<Longueur> getLongueurs() {
        return longueurs;
    }

    public void setLongueurs(List<Longueur> longueurs) {
        this.longueurs = longueurs;
    }





	public Integer getVoie_id() {
		return voie_id;
	}

	public void setVoie_id(Integer voie_id) {
		this.voie_id = voie_id;
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
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	
	
	

}
