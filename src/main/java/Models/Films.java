package Models;

import java.util.ArrayList;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Films {
	@Id
	@GeneratedValue
	private int ID_film;
	private String title;
	public int duree;
	private String DateSortie;
	private String Description;
	private ArrayList<Genre> Genre;
	private ArrayList<Acteurs> Acteurs;
	
	
	
	public Films(int iD_film, String title, int duree, String dateSortie, String description,
			ArrayList<Models.Genre> genre, ArrayList<Models.Acteurs> acteurs) {
		super();
		ID_film = iD_film;
		this.title = title;
		this.duree = duree;
		DateSortie = dateSortie;
		Description = description;
		Genre = genre;
		Acteurs = acteurs;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public ArrayList<Genre> getGenre() {
		return Genre;
	}
	public void setGenre(ArrayList<Genre> genre) {
		Genre = genre;
	}
	public int getID_film() {
		return ID_film;
	}
	public void setID_film(int iD_film) {
		ID_film = iD_film;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public ArrayList<Acteurs> getActeurs() {
		return Acteurs;
	}
	public void setActeurs(ArrayList<Acteurs> acteurs) {
		Acteurs = acteurs;
	}
	
	
	

}
