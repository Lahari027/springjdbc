package com.dbs.springbootjdbctemplate.service;


import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.dbs.springbootjdbctemplate.dto.Employee;
import com.dbs.springbootjdbctemplate.exception.EntityNotFoundException;
import com.dbs.springbootjdbctemplate.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
EmployeeRepository employeeRepository;
@Override
public Employee createEmployee(Employee employee) {
// TODO Auto-generated method stub
return employeeRepository.save(employee);
}
@Override
public Employee updateEmployee(String empId, Employee employee) {
// TODO Auto-generated method stub
	Optional<Employee> emp=employeeRepository.findById(empId);
	if(emp.isEmpty()) {
		return null;
	}
	else {
		employeeRepository.save(employee);
	}
	return employee;

} @Override
public Employee getEmployeeById(String empId) throws EntityNotFoundException {
	Optional<Employee> optional = employeeRepository.findById(empId);
	if(optional.isPresent()) {
	return optional.get();
	}
	else {
	//optional.orElseThrow(()-> new EntityNotFoundException("record not found"));
	//return null; or

	throw new EntityNotFoundException("record not found");

	}
} @Override
public Optional<List<Employee>> getEmployees() {
	List<Employee> employees=employeeRepository.findAll();
	if(employees.isEmpty()) {
		return Optional.empty();
	}
// TODO Auto-generated method stub
	else{return Optional.of(employees);
	}
}
public Optional<List<Employee>> getEmployeeByLastName(String empLastName){
	return employeeRepository.findByEmpLastName(empLastName);
}

@Override
public Optional<Employee> getEmployeesByIdAndLastname(String empId, String empLastName) {
	// TODO Auto-generated method stub
	return  employeeRepository.findByEmpIdAndEmpLastName(empId, empLastName) ;
}
public void deleteAll() {
	employeeRepository.deleteAll();
}
public void deleteById(String empId) {
	employeeRepository.deleteById(empId);
}
@Override
public Optional<Employee> deleteEmployee(String empId) {
	// TODO Auto-generated method stub
	Optional<Employee> employee=employeeRepository.findById(empId);
	if(employee.isEmpty()) {
		return null;

	}

	employeeRepository.deleteById(empId);
	return (employee);
}
}

