package com.andresvg.tiendavirtualdemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import com.andresvg.tiendavirtualdemo.entity.Employee;
import com.andresvg.tiendavirtualdemo.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository er;

	@Override
	@Transactional(readOnly=true)
	public Iterable<Employee> findAll() {
		return er.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Employee> findAll(Pageable pageable) {
		return er.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Employee> findById(Long id) {
		return er.findById(id);
	}

	@Override
	@Transactional
	public Employee save(Employee employee) {
		return er.save(employee);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		er.deleteById(id);
	}

}
