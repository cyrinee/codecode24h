package Models;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity

@Table(name="Acteurs")

public class Acteurs {
	
	@Id
	@GeneratedValue
	private String nom;
	private String prenom;
	private String origine;
	private String roles;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public Acteurs(String nom, String prenom, String origine, String roles) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.origine = origine;
		this.roles = roles;
	}

}
