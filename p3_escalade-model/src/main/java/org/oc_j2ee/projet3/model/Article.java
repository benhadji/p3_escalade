package org.oc_j2ee.projet3.model;

public class Article {


	private Integer id;					// Primary Key
	private Integer utilisateur_id;		// Foreign key
	private String titre;
	private String auteur;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUtilisateur_id() {
		return utilisateur_id;
	}

	public void setUtilisateur_id(Integer utilisateur_id) {
		this.utilisateur_id = utilisateur_id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public String getAuteur() {
		return auteur;
	}
	
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	

	
		
}

