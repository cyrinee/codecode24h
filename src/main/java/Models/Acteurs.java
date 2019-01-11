package Models;


import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.Entity;

@Entity
@Table(name="Acteurs")

public class Acteurs {
	
	@Id
	@GeneratedValue
	private String ID_acteur;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "origine")
	private String origine;
	@Column(name = "roles")
	private String roles;
	@ManyToMany(mappedBy = "Films")
	private ArrayList<Films> Films;
	 @ManyToMany(mappedBy="Series")
	private ArrayList<Series> Series;
	
	
	public String getID_acteur() {
		return ID_acteur;
	}
	public void setID_acteur(String iD_acteur) {
		ID_acteur = iD_acteur;
	}
	public ArrayList<Films> getFilms() {
		return Films;
	}
	public void setFilms(ArrayList<Films> films) {
		Films = films;
	}
	public ArrayList<Series> getSeries() {
		return Series;
	}
	public void setSeries(ArrayList<Series> series) {
		Series = series;
	}
	public Acteurs(String iD_acteur, String nom, String prenom, String origine, String roles,
			ArrayList<Models.Films> films, ArrayList<Models.Series> series) {
		super();
		ID_acteur = iD_acteur;
		this.nom = nom;
		this.prenom = prenom;
		this.origine = origine;
		this.roles = roles;
		Films = films;
		Series = series;
	}
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
	

}
