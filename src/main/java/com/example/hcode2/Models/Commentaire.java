package com.example.hcode2.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name="Commentaire")
public class Commentaire {
	@Id
	@GeneratedValue
	private int ID_commentaire;
	@Column(name="contenu")			
	private String contenu;
	@OneToOne
	private User User;
	@OneToOne
	private Films Films;
	@OneToOne
	private Series Series;
	
	public int getID_commentaire() {
		return ID_commentaire;
	}
	public void setID_commentaire(int iD_commentaire) {
		ID_commentaire = iD_commentaire;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		User = user;
	}
	public Films getFilms() {
		return Films;
	}
	public void setFilms(Films films) {
		Films = films;
	}
	public Series getSeries() {
		return Series;
	}
	public void setSeries(Series series) {
		Series = series;
	}
	public Commentaire(int iD_commentaire, String contenu, User user, Films films, Series series) {
		super();
		ID_commentaire = iD_commentaire;
		this.contenu = contenu;
		User = user;
		Films = films;
		Series = series;
	}
	


}
