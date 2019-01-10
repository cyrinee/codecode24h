package Models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity

@Table(name="User")
public class User  extends Personne{
	private ArrayList<Films> preferedFilms;
	private ArrayList<Series> preferedSeries;
	private ArrayList<Type> preferedTypes;
	private ArrayList<Genre> preferedGenres;


	


	public User() {
		// TODO Auto-generated constructor stub
	}

}
