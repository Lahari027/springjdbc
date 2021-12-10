package com.dbs.springbootjdbctemplate.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.dbs.springbootjdbctemplate.dto.Department;

public class DepartmentRowMapper {
	public Department mapRow(ResultSet rs,int rowNum) throws SQLException
	{
		Department department= new Department();
		department.setDeptId(rs.getString("deptId"));
		department.setDeptName(rs.getString("deptName"));
		department.setLocation(rs.getString("Location"));
		return department;

	}

}
