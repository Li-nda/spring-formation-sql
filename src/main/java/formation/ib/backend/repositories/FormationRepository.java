package formation.ib.backend.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.ib.backend.entities.Formation;

public interface FormationRepository extends JpaRepository<Formation, Long> {
	
	// Spring DATA comprend qu'il faut aller chercher toutes les formations qui possède ce titre
	// Spring DATA se base sur le nom de la méthode
	// il comprend naturellement qu'il faut retourner une liste de formation avec le getter de l'attribut qui est ajouté après "findBy"
	public List<Formation> findByTitre(String titre); 
	
	public List<Formation> findByDescription(String description);
	
	
	
//	public List<Formation> findByDescriptionOrTitre(String description, String titre);
//	
//	public List<Formation> findByDescriptionAndTitre(String description, String titre);
}
