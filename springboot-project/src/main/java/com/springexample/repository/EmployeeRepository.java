package com.springexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springexample.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
