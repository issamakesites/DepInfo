package com.deptInfo.magasin.service;

import com.deptInfo.magasin.model.Fourniture;
import com.deptInfo.magasin.repo.FournitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FournitureServiceImpl implements FournitureService {

	@Autowired
	private FournitureRepo fournitureRepository;

	@Override
	public List<Fourniture> findAll() {
		return fournitureRepository.findAll();
	}

	@Override
	public Fourniture findById(long id) {
		return fournitureRepository.findById(id).orElse(null);
	}

	@Override
	public Fourniture save(Fourniture fourniture) {
		return fournitureRepository.save(fourniture);
	}

	@Transactional(readOnly = true)
	public List<Fourniture> searchByType(String type) {
		return fournitureRepository.findByTypeContaining(type);
	}

	@Override
	public void deleteById(long id) {
		fournitureRepository.deleteById(id);
	}
}
