package com.example.hcode2.Models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Favoris {
	
	@Id @GeneratedValue
	@Column(name = "id")
	private int id;
	@OneToOne
	private User User;
	@OneToMany
	private ArrayList<Films> preferedFilms;
	@OneToMany
	private ArrayList<Series> preferedSeries;
	public Favoris(int id, Models.User user, ArrayList<Films> preferedFilms, ArrayList<Series> preferedSeries) {
		super();
		this.id = id;
		User = user;
		this.preferedFilms = preferedFilms;
		this.preferedSeries = preferedSeries;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		User = user;
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
	
	
	

}
