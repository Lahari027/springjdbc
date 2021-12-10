package com.dbs.springbootjdbctemplate.service;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;



import com.dbs.springbootjdbctemplate.dto.Employee;
import com.dbs.springbootjdbctemplate.exception.EntityNotFoundException;



public interface EmployeeService {
public Employee createEmployee(Employee employee);
public Optional<Employee> deleteEmployee(String empId);
public Employee updateEmployee(String empId,Employee employee);
public Employee getEmployeeById(String empId)throws EntityNotFoundException;
public Optional<List<Employee>> getEmployees();
public void deleteAll();
public void deleteById(String empId);
public Optional<List<Employee>> getEmployeeByLastName(String emplastName);
public Optional<Employee> getEmployeesByIdAndLastname(String empId, String empLastName);
}