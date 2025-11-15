package com.MarkSheet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.MarkSheet.Dao.MarkSheetDao;
import com.MarkSheet.Entity.MarkSheetEntity;




@Service
public class MarkSheetService {
	@Autowired
	MarkSheetDao md;

	public String PostAll(List <MarkSheetEntity> a) {
		a.forEach(x->{
			x.setSem1Total(x.getSem1Practicals()+x.getSem1Theory());
		    x.setSem2Total(x.getSem2Practicals()+x.getSem2Theory());
		});
		return md.PostAll(a);
		
	}
	
	public List<MarkSheetEntity> get(){
		return md.get();
	}
	
}
