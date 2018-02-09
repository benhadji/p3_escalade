package org.oc_j2ee.projet3.model;

import java.util.ArrayList;
import java.util.List;

public class Topo {

	private Integer id;
	private Integer siteId;
	private Integer utilisateurId;
	private String nom;
	private boolean emprunt;
	private Site site;
	private List<Site> sites = new ArrayList<>();
	private Utilisateur utilisateur;


    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

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
