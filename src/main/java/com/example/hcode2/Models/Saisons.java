package com.example.hcode2.Models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Saisons {
	
	@OneToOne
    @JoinColumn(name="ID_Series")
	private Series Series;
	@Id
	@GeneratedValue
	private int ID_Saisons;
	@Column(name = "duree")
	public int duree;
	@Column(name = "title")
	private String title;
	@Column(name = "num_Saisons")
	private int num_Saisons;
	@Column(name = "DateSortie")
	private String DateSortie;
	@Column(name = "Description")
	private String Description;
	@OneToMany
	private ArrayList<Episodes> Episodes;
	public Saisons(Models.Series series, int iD_Saisons, int duree, String title, int num_Saisons, String dateSortie,
			String description, ArrayList<Models.Episodes> episodes) {
		super();
		Series = series;
		ID_Saisons = iD_Saisons;
		this.duree = duree;
		this.title = title;
		this.num_Saisons = num_Saisons;
		DateSortie = dateSortie;
		Description = description;
		Episodes = episodes;
	}
	public Series getSeries() {
		return Series;
	}
	public void setSeries(Series series) {
		Series = series;
	}
	public int getID_Saisons() {
		return ID_Saisons;
	}
	public void setID_Saisons(int iD_Saisons) {
		ID_Saisons = iD_Saisons;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNum_Saisons() {
		return num_Saisons;
	}
	public void setNum_Saisons(int num_Saisons) {
		this.num_Saisons = num_Saisons;
	}
	public String getDateSortie() {
		return DateSortie;
	}
	public void setDateSortie(String dateSortie) {
		DateSortie = dateSortie;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public ArrayList<Episodes> getEpisodes() {
		return Episodes;
	}
	public void setEpisodes(ArrayList<Episodes> episodes) {
		Episodes = episodes;
	}
	
	

}
