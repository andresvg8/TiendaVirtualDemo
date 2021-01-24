package com.andresvg.tiendavirtualdemo.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.andresvg.tiendavirtualdemo.entity.Customer;

public interface CustomerService {
	public Iterable<Customer> findAll();
	
	public Page<Customer> findAll(Pageable pageable);
	
	public Optional<Customer> findById(Long id);
	
	public Customer save(Customer customer);
	
	public void deleteById(Long id);
}
