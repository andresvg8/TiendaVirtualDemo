package com.andresvg.tiendavirtualdemo.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.andresvg.tiendavirtualdemo.entity.Employee;

public interface EmployeeService {
	public Iterable<Employee> findAll();
	
	public Page<Employee> findAll(Pageable pageable);
	
	public Optional<Employee> findById(Long id);
	
	public Employee save(Employee employee);
	
	public void deleteById(Long id);
}
