package com.xadmin.demo.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xadmin.demo.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	List<Employee> findAll();

//	Page<Employee> findAll(Pageable pageable);

}