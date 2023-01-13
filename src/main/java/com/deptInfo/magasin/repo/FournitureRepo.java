package com.deptInfo.magasin.repo;

import com.deptInfo.magasin.model.Fourniture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FournitureRepo extends JpaRepository<Fourniture, Long> {
	List<Fourniture> findByTypeContaining(String type);
}
