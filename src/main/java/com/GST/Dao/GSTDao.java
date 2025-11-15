package com.GST.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.GST.Entity.GSTEntity;
import com.GST.Repository.GSTRepository;

@Repository
public class GSTDao {
	@Autowired
	GSTRepository gc;
public String PostAll(List <GSTEntity> a) {
		
		
		gc.saveAll(a);
		return "saved successfully";
	}
	

public Integer get( Integer a) {

	return gc.get(a);
}
}
