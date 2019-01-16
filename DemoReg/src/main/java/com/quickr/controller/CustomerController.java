
package com.quickr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quickr.model.Customer;
import com.quickr.repository.CustomerRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class CustomerController {
	 
	@Autowired
	CustomerRepository repository;
	
	
	@PostMapping("/customers/create")
	public void postCustomer(@RequestBody Customer customer) {
 
		repository.save(customer);
		
	}
	
}