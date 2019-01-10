package Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Commentaire")
public class Commentaire {
	@Id
	@GeneratedValue
	private int ID_commentaire;
	@Column(name="contenu")

	private String contenu;


}
