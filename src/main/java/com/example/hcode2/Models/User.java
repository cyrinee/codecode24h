package com.example.hcode2.Models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity

@Table(name="User")
public class User  extends Personne{
	@OneToMany
	private ArrayList<Films> preferedFilms;
	@OneToMany
	private ArrayList<Series> preferedSeries;
	@OneToMany
	private ArrayList<Type> preferedTypes;
	@OneToMany
	private ArrayList<Genre> preferedGenres;
	@OneToMany
	private ArrayList<Commentaire> Commentaire;
	@OneToMany
	private ArrayList<Preference> Preference;
	@OneToMany
	private ArrayList<Favoris> Favoris;
	
	public User(ArrayList<Films> preferedFilms, ArrayList<Series> preferedSeries, ArrayList<Type> preferedTypes,
			ArrayList<Genre> preferedGenres, ArrayList<Models.Commentaire> commentaire,
			ArrayList<com.example.hcode2.Models.Preference> preference, ArrayList<com.example.hcode2.Models.Favoris> favoris) {
		super();
		this.preferedFilms = preferedFilms;
		this.preferedSeries = preferedSeries;
		this.preferedTypes = preferedTypes;
		this.preferedGenres = preferedGenres;
		Commentaire = commentaire;
		Preference = preference;
		Favoris = favoris;
	}
	public ArrayList<Films> getPreferedFilms() {
		return preferedFilms;
	}
	public void setPreferedFilms(ArrayList<Films> preferedFilms) {
		this.preferedFilms = preferedFilms;
	}
	public ArrayList<Series> getPreferedSeries() {
		return preferedSeries;
	}
	public void setPreferedSeries(ArrayList<Series> preferedSeries) {
		this.preferedSeries = preferedSeries;
	}
	public ArrayList<Type> getPreferedTypes() {
		return preferedTypes;
	}
	public void setPreferedTypes(ArrayList<Type> preferedTypes) {
		this.preferedTypes = preferedTypes;
	}
	public ArrayList<Genre> getPreferedGenres() {
		return preferedGenres;
	}
	public void setPreferedGenres(ArrayList<Genre> preferedGenres) {
		this.preferedGenres = preferedGenres;
	}
	public ArrayList<Commentaire> getCommentaire() {
		return Commentaire;
	}
	public void setCommentaire(ArrayList<Commentaire> commentaire) {
		Commentaire = commentaire;
	}
	public ArrayList<Preference> getPreference() {
		return Preference;
	}
	public void setPreference(ArrayList<Preference> preference) {
		Preference = preference;
	}
	public ArrayList<Favoris> getFavoris() {
		return Favoris;
	}
	public void setFavoris(ArrayList<Favoris> favoris) {
		Favoris = favoris;
	}

	

	


}
