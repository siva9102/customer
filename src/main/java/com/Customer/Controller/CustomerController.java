package com.Customer.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.Customer.Entity.CustomerEntity;
import com.Customer.Repository.CustomerRepository;
@RestController
@RequestMapping(value = "/cstm/api")
public class CustomerController {
	@Autowired
	CustomerRepository cs;
	@Autowired
	RestTemplate rt;
	@PostMapping(value="/getmap")
	public List<CustomerEntity> get(@RequestBody List<CustomerEntity> c) {
        c.forEach(x->{
        	
        	String url="http://localhost:8086/bnk/api/getifsc/";
        	
        	String branch=rt.exchange(url+x.getIfsccode(),HttpMethod.GET,null,String.class).getBody();
        	
        	x.setBranch(branch);});
        
        	return  cs.saveAll(c);
    }



}
