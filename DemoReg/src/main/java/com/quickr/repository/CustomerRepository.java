
package com.quickr.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.quickr.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{
	
}