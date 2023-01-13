package com.deptInfo.magasin.service;

import com.deptInfo.magasin.model.Enseignant;
import com.deptInfo.magasin.model.Fourniture;

import java.util.List;
public interface FournitureService {

	List<Fourniture> findAll();
	Fourniture findById(long id);
	Fourniture save(Fourniture fourniture);
	void deleteById(long id);

	List<Fourniture> searchByType(String type);

}
