package com.andresvg.tiendavirtualdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andresvg.tiendavirtualdemo.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
