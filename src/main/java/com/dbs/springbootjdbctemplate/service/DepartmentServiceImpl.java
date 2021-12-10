package com.dbs.springbootjdbctemplate.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.springbootjdbctemplate.dto.Department;
import com.dbs.springbootjdbctemplate.repository.DepartmentRepository;
@Service
public class DepartmentServiceImpl  implements DepartmentService
{
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public Department createDepartment(Department Department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(Department);
	}

	@Override
	public Department deleteDepartment(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department updateDepartment(String empId, Department Department) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Department> getDepartmentById(String deptId) {
		// TODO Auto-generated method stub
		
		return departmentRepository.findById(deptId);
	}

	@Override
	public Optional<List<Department>> getDepartments() {
		// TODO Auto-generated method stub
	List<Department> dept= departmentRepository.findAll();
		if(dept.isEmpty()) {
			return Optional.empty();
		}
		return Optional.of(dept);
	}

	@Override
	public Optional<List<Department>> getDepartmentByLocation(String emplastName) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	/*public Optional<Department> getDepartmentsByIdAndLastname(String empId, String empLastName) {
		// TODO Auto-generated method stub
		return null;
	}*/

	
		
	

}
