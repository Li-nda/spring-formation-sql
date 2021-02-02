package formation.ib.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "formations")
public class Formation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // signifie que la clé va être générée automatiquement
	private Long id; // il est préférable d'utiliser les Wrapper (pour toutes les données)
	
	@Column(name = "titre") // on ajoute une colonne "titre" dans une table
	private String titre;
	
	@Column(name = "description") //on ajoute une colonne "desciption" dans une table
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
