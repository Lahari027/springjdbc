package com.dbs.springbootjdbctemplate.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.springbootjdbctemplate.dto.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

public Optional<List<Employee>> findByEmpLastName(String empLastName);
public Optional<Employee> findByEmpIdAndEmpLastName(String empId,String empLastName);
}

