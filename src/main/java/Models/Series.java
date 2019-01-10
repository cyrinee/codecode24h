package Models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table(name="Series")
public class Series {
	
	@Id
	@GeneratedValue
	private int ID_Series;
	private int duree;
	private String title;
	private String DateSortie;
	private String Description;
	private ArrayList<Genre> Genre;
	private ArrayList<Episodes> Episodes;
	private ArrayList<Acteurs> Acteurs;
	public Series(int iD_Series, int duree, String title, String dateSortie, String description,
			ArrayList<Models.Genre> genre, ArrayList<Models.Episodes> episodes, ArrayList<Models.Acteurs> acteurs) {
		super();
		ID_Series = iD_Series;
		this.duree = duree;
		this.title = title;
		DateSortie = dateSortie;
		Description = description;
		Genre = genre;
		Episodes = episodes;
		Acteurs = acteurs;
	}
	public int getID_Series() {
		return ID_Series;
	}
	public void setID_Series(int iD_Series) {
		ID_Series = iD_Series;
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
	public ArrayList<Genre> getGenre() {
		return Genre;
	}
	public void setGenre(ArrayList<Genre> genre) {
		Genre = genre;
	}
	public ArrayList<Episodes> getEpisodes() {
		return Episodes;
	}
	public void setEpisodes(ArrayList<Episodes> episodes) {
		Episodes = episodes;
	}
	public ArrayList<Acteurs> getActeurs() {
		return Acteurs;
	}
	public void setActeurs(ArrayList<Acteurs> acteurs) {
		Acteurs = acteurs;
	}
	
	
}