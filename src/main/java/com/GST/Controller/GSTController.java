package com.GST.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.GST.Entity.GSTEntity;
import com.GST.Service.GSTService;


@RestController
@RequestMapping(value = "/gst/api")
public class GSTController {
	@Autowired
	GSTService gs;

	@PostMapping(value = "/Postvalue")
	public String PostAll(@RequestBody List<GSTEntity> a) {

		return gs.PostAll(a);
	}
	@GetMapping(value = "/getvalue1/{a}")
	public Integer get(@PathVariable Integer a) {

		return gs.get(a);
	}
}
