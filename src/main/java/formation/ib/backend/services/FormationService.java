package formation.ib.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import formation.ib.backend.entities.Formation;
import formation.ib.backend.repositories.FormationRepository;

@Service
public class FormationService {
	
	@Autowired
	private FormationRepository repository;

	public <S extends Formation> S save(S entity) {
		return repository.save(entity);
	}

	public List<Formation> findAll() {
		return repository.findAll();
	}

	public List<Formation> findByTitre(String titre) {
		return repository.findByTitre(titre);
	}

	public List<Formation> trouverAvecLaDescription(String description) {
		return repository.findByDescription(description);
	}
	
	// Pour retrouver l'Id, il n'y a pas besoin de déclarer cette méthode dans une interface car Spring l'a crée naturellement
	// il suffit d'utiliser Generate Method
	public Formation findById(Long id) {
		return repository.findById(id)
				.orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}

}
