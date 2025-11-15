package com.MarkSheet.Dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.MarkSheet.Entity.MarkSheetEntity;
import com.MarkSheet.Repository.MarkSheetRepository;

@Repository
public class MarkSheetDao {
	@Autowired
	MarkSheetRepository mr;
	
	public String PostAll (List <MarkSheetEntity> a) {
	mr.saveAll(a);	
	return "saved successfully";
	}
	
	public List<MarkSheetEntity> get(){
		return mr.findAll();
	}
	public String get1(@PathVariable Integer a) {
		 mr.deleteById(a);
			return "deleted successfully";
		
		
		
	}
}
