package com.deptInfo.magasin.resource;

import com.deptInfo.magasin.model.Enseignant;
import com.deptInfo.magasin.model.Materiel;
import com.deptInfo.magasin.service.MaterielService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materiels")
public class MaterielController {
	@Autowired
	private MaterielService materielService;

	@PostMapping
	public ResponseEntity<Materiel> createMateriel(@RequestBody Materiel materiel) {
		Materiel createdMateriel = materielService.createMateriel(materiel);
		return new ResponseEntity<>(createdMateriel, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Materiel> getMaterielById(@PathVariable Long id) {
		Materiel materiel = materielService.getMaterielById(id);
		if (materiel == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(materiel, HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Materiel>> getAllMateriels() {
		List<Materiel> materiels = materielService.getAllMateriels();
		return new ResponseEntity<>(materiels, HttpStatus.OK);
	}

	@GetMapping("/enseignant/{id}")
	public ResponseEntity<List<Materiel>> findMaterielsByEnseignant(@PathVariable Long id) {
		Enseignant enseignant = new Enseignant();
		enseignant.setId(id);
		List<Materiel> materiels = materielService.findMaterielsByEnseignant(enseignant);
		return new ResponseEntity<>(materiels, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public Materiel updateMateriel(@PathVariable(value = "id") long id, @RequestBody Materiel materiel) {
		Materiel currentMateriel = materielService.getMaterielById(id);
		currentMateriel.setnInverntaire(materiel.getnInverntaire());
		currentMateriel.setTypeMateriel(materiel.getTypeMateriel());
		currentMateriel.setDateAcquisition(materiel.getDateAcquisition());
		currentMateriel.setEnseignant(materiel.getEnseignant());
		currentMateriel.setDateAffectation(materiel.getDateAffectation());
		return materielService.createMateriel(currentMateriel);
	}

		@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteMateriel(@PathVariable Long id) {
		materielService.deleteMateriel(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
