package com.andresvg.tiendavirtualdemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andresvg.tiendavirtualdemo.entity.Customer;
import com.andresvg.tiendavirtualdemo.service.CustomerServiceImpl;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	@Autowired
	private CustomerServiceImpl cs;
	
	// Create a new Customer into database
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Customer newCustomer) {
		return ResponseEntity.status(HttpStatus.CREATED).body(cs.save(newCustomer));
	}
	
	// Retrieve a customer from database
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable(value="id") Long idCustomer){
		//return ResponseEntity.status(HttpStatus.FOUND).body(cs.findById(idCustomer));
		Optional<Customer> oCustomer=cs.findById(idCustomer);
		if( oCustomer.isPresent() ) {
			return ResponseEntity.ok(oCustomer);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
}
