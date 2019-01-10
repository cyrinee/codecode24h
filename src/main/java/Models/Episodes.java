package Models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class Episodes {
	@Id
	@GeneratedValue
	private int ID_serie;
	private int ID_episode;
	public int duree;
	private String title;
	private int num_episode;
	private String DateSortie;
	private String Description;
	
	
	
	public Episodes(int iD_serie, int iD_episode, int duree, String title, int num_episode, String dateSortie,
			String description) {
		super();
		ID_serie = iD_serie;
		ID_episode = iD_episode;
		this.duree = duree;
		this.title = title;
		this.num_episode = num_episode;
		DateSortie = dateSortie;
		Description = description;
	}
	
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public int getID_serie() {
		return ID_serie;
	}
	public void setID_serie(int iD_serie) {
		ID_serie = iD_serie;
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
