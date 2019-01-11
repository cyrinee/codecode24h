package Models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity

@Table(name="Series")
public class Series {
	
	@Id
	@GeneratedValue
	private int ID_Series;
	@Column(name = "duree")
	private int duree;
	@Column(name = "title")
	private String title;
	@Column(name = "DateSortie")
	private String DateSortie;
	@Column(name = "Description")
	private String Description;
	
	@OneToMany
	private ArrayList<Genre> Genre;
	@OneToMany
	private ArrayList<Saisons> Saisons;
	@OneToMany
	private ArrayList<Acteurs> Acteurs;
	
	public Series(int iD_Series, int duree, String title, String dateSortie, String description,
			ArrayList<Models.Genre> genre, ArrayList<Models.Saisons> Saisons, ArrayList<Models.Acteurs> acteurs) {
		super();
		ID_Series = iD_Series;
		this.duree = duree;
		this.title = title;
		DateSortie = dateSortie;
		Description = description;
		Genre = genre;
		Saisons = Saisons;
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
	public ArrayList<Saisons> getEpisodes() {
		return Saisons;
	}
	public void setEpisodes(ArrayList<Saisons> Saisons) {
		Saisons = Saisons;
	}
	public ArrayList<Acteurs> getActeurs() {
		return Acteurs;
	}
	public void setActeurs(ArrayList<Acteurs> acteurs) {
		Acteurs = acteurs;
	}
	
	
}