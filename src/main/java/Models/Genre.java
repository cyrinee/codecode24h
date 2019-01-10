package Models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Genre {
	@Id
	@GeneratedValue
	private int id_genre;
	private String genre;
	public int getId_genre() {
		return id_genre;
	}
	public void setId_genre(int id_genre) {
		this.id_genre = id_genre;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Genre(int id_genre, String genre) {
		super();
		this.id_genre = id_genre;
		this.genre = genre;
	}
	

}
