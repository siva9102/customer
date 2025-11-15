package com.MarkSheet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MarkSheet.Entity.MarkSheetEntity;
import com.MarkSheet.Service.MarkSheetService;


@RestController
@RequestMapping(value = "/msht/api")
public class MarkSheetController {
	@Autowired
	MarkSheetService ms;

	@PostMapping(value = "/Postvalue")
	public String PostAll(@RequestBody List<MarkSheetEntity> a) {

		return ms.PostAll(a);
	}
	
	@GetMapping(value="/getall")
	public List<MarkSheetEntity> get(){
		return ms.get();
	}
}
