package org.oc_j2ee.projet3.model;

public class Article {
	
	private Integer numero;			// Primary Key
	private String titre;
	private String auteur;
	
	public Article()
	{
		
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
	
	public Integer getNumero()
	{
		return numero;
	}

	public void setNumero(Integer numero)
	{
		this.numero = numero;
	}

	
		
}

