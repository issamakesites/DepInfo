package com.deptInfo.magasin.repo;

import com.deptInfo.magasin.model.Enseignant;
import com.deptInfo.magasin.model.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaterielRepo extends JpaRepository<Materiel, Long> {
	List<Materiel> findByEnseignant(Enseignant enseignant);
}
