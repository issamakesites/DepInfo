package com.deptInfo.magasin.resource;

import com.deptInfo.magasin.model.Fourniture;
import com.deptInfo.magasin.service.FournitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FournitureResource {

	@Autowired
	private FournitureService fournitureService;

	@GetMapping("/fournitures")
	public List<Fourniture> getAllFournitures() {
		return fournitureService.findAll();
	}
	@GetMapping("/fournitures/search")
	public List<Fourniture> search(@RequestParam("type") String type) {
		return fournitureService.searchByType(type);
	}
	@GetMapping("/fournitures/{id}")
	public Fourniture getFournitureById(@PathVariable(value = "id") long id) {
		return fournitureService.findById(id);
	}

	@PostMapping("/fournitures")
	public Fourniture createFourniture(@RequestBody Fourniture fourniture) {
		return fournitureService.save(fourniture);
	}

	@PutMapping("/fournitures/{id}")
	public Fourniture updateFourniture(@PathVariable(value = "id") long id, @RequestBody Fourniture fourniture) {
		Fourniture currentFourniture = fournitureService.findById(id);
		currentFourniture.setType(fourniture.getType());
		currentFourniture.setNombre(fourniture.getNombre());
		return fournitureService.save(currentFourniture);
	}

	@DeleteMapping("/fournitures/{id}")
	public void deleteFourniture(@PathVariable(value = "id") long id) {
		fournitureService.deleteById(id);
	}

}
