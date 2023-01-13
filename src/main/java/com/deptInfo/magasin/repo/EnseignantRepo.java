package com.deptInfo.magasin.repo;

import com.deptInfo.magasin.model.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnseignantRepo extends JpaRepository<Enseignant, Long> {
	//List<Enseignant> findByNomContaining(String type);
	Enseignant getEnseignantById(Long enseignantId);
}
