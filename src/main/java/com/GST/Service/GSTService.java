package com.GST.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.GST.Dao.GSTDao;
import com.GST.Entity.GSTEntity;

@Service
public class GSTService {
	@Autowired
	GSTDao gd;
	public String PostAll(List <GSTEntity> a) {
		return gd.PostAll(a);
		
	}
	
	public Integer get( Integer a) {

		return gd.get(a);
	}
}
