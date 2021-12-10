package com.dbs.springbootjdbctemplate.service;

import java.util.List;
import java.util.Optional;

import com.dbs.springbootjdbctemplate.dto.Department;

public interface DepartmentService {
	public Department createDepartment(Department department);
	public Department deleteDepartment(String empId);
	public Department updateDepartment(String empId,Department department);
	public Optional<Department> getDepartmentById(String empId);
	public Optional<List<Department>> getDepartments();
	public Optional<List<Department>> getDepartmentByLocation(String emplastName);
	//public Optional<Department> getDepartmentsByIdAndLastname(String empId, String empLastName);

}
