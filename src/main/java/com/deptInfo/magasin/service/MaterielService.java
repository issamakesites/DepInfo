package com.deptInfo.magasin.service;

import com.deptInfo.magasin.exception.ResourceNotFoundException;
import com.deptInfo.magasin.model.Enseignant;
import com.deptInfo.magasin.model.Materiel;
import com.deptInfo.magasin.repo.MaterielRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MaterielService {
	@Autowired
	private MaterielRepo materielRepository;

	public Materiel createMateriel(Materiel materiel) {
		return materielRepository.save(materiel);
	}

	public Materiel getMaterielById(Long id) {
		return materielRepository.findById(id).orElse(null);
	}

	public List<Materiel> getAllMateriels() {
		return materielRepository.findAll();
	}

	public Materiel updateMateriel(Materiel materiel) {
		return materielRepository.save(materiel);
	}

	public void deleteMateriel(Long id) {
		materielRepository.deleteById(id);
	}
	public List<Materiel> findMaterielsByEnseignant(Enseignant enseignant) {
		return materielRepository.findByEnseignant(enseignant);
	}
}
