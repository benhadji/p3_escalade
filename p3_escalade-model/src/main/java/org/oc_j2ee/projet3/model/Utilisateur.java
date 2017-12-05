package org.oc_j2ee.projet3.model;

public class Utilisateur {


	private Integer id;
	private String nom;
	private String prenom;
	private String pseudo;
	private String mail;
	private String role;

	public Integer getId() {
		return id;
	}

	protected void setId(Integer id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	protected void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	protected void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getPseudo() {
		return pseudo;
	}
	
	protected void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	public String getMail() {
		return mail;
	}
	
	protected void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getRole() {
		return role;
	}
	
	protected void setRole(String role) {
		this.role = role;
	}

	
	

}
