package com.deptInfo.magasin.service;

import com.deptInfo.magasin.model.Enseignant;
import com.deptInfo.magasin.repo.EnseignantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnseignantService {
	private final EnseignantRepo enseignantRepo;

	@Autowired
	public EnseignantService(EnseignantRepo enseignantRepo) {
		this.enseignantRepo = enseignantRepo;
	}

	public Enseignant createEnseignant(Enseignant enseignant) {
		return enseignantRepo.save(enseignant);
	}

	public Enseignant getEnseignantById(Long id) {
		Optional<Enseignant> enseignant = enseignantRepo.findById(id);
		return enseignant.orElse(null);
	}

	public List<Enseignant> getAllEnseignants() {
		return enseignantRepo.findAll();
	}

	public Enseignant updateEnseignant(Long id, Enseignant enseignant) {
		Enseignant existingEnseignant = getEnseignantById(id);
		if (existingEnseignant == null) {
			return null;
		}
		existingEnseignant.setGradeEnseignant(enseignant.getGradeEnseignant());
		existingEnseignant.setChefDept(enseignant.getChefDept());
		existingEnseignant.setAdjoint(enseignant.getAdjoint());
		return enseignantRepo.save(existingEnseignant);
	}

	public void deleteEnseignant(Long id) {
		enseignantRepo.deleteById(id);
	}
}
