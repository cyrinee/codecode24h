package Models;

import java.util.ArrayList;

public class Films {
	private int ID_film;
	private String title;
	private String DateSortie;
	private String Description;
	private ArrayList<Acteurs> Acteurs;
	
	
	public Films(int iD_film, String title, String dateSortie, String description, ArrayList<Models.Acteurs> acteurs) {
		super();
		ID_film = iD_film;
		this.title = title;
		DateSortie = dateSortie;
		Description = description;
		Acteurs = acteurs;
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
