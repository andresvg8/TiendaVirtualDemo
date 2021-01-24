package com.andresvg.tiendavirtualdemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andresvg.tiendavirtualdemo.entity.Customer;
import com.andresvg.tiendavirtualdemo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository cr;
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Customer> findAll() {
		return cr.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Customer> findAll(Pageable pageable) {
		return cr.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Customer> findById(Long id) {
		return cr.findById(id);
	}

	@Override
	@Transactional
	public Customer save(Customer customer) {
		return cr.save(customer);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		cr.deleteById(id);
	}

}
