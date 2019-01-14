package com.example.hcode2.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Episodes {
	
	
	@Id
	@GeneratedValue
	private int ID_episode;
	@OneToOne
    @JoinColumn(name="ID_Saisons")
	private com.example.hcode2.Models.Saisons Saisons;
	@Column(name = "duree")
	public int duree;
	@Column(name = "title")
	private String title;
	@Column(name = "num_episode")
	private int num_episode;
	@Column(name = "DateSortie")
	private String DateSortie;
	@Column(name = "Description")
	private String Description;
	
	
	
	
	
	
	public Episodes(int iD_serie, int iD_episode, com.example.hcode2.Models.Saisons iD_Saisons, int duree, String title, int num_episode,
			String dateSortie, String description) {
		super();
		ID_episode = iD_episode;
		Saisons = iD_Saisons;
		this.duree = duree;
		this.title = title;
		this.num_episode = num_episode;
		DateSortie = dateSortie;
		Description = description;
	}
	
	public com.example.hcode2.Models.Saisons getSaisons() {
		return Saisons;
	}

	public void setSaisons(com.example.hcode2.Models.Saisons iD_Saisons) {
		Saisons = iD_Saisons;
	}

	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	public int getID_episode() {
		return ID_episode;
	}
	public void setID_episode(int iD_episode) {
		ID_episode = iD_episode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNum_episode() {
		return num_episode;
	}
	public void setNum_episode(int num_episode) {
		this.num_episode = num_episode;
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
	
}
