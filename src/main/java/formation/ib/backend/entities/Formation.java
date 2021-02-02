package formation.ib.backend.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany
	@JoinTable(// signifie table de jointure
			name = "formation_possede_theme", // signifie que cette table s'appelera formation_possede_theme
			joinColumns = @JoinColumn(name = "formation_id"), // la colonne où se trouvera l'Id du theme s'appelera formation_id
			inverseJoinColumns = @JoinColumn(name = "theme_id"))
	private List<Theme> themes = new ArrayList<>();

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

	public List<Theme> getThemes() {
		return themes;
	}

	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}
	
	

}
