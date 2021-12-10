
package com.dbs.springbootjdbctemplate.controller;import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dbs.springbootjdbctemplate.dto.Department;
import com.dbs.springbootjdbctemplate.service.DepartmentService;@RestController
@RequestMapping("/dept")
public class DepartmentController {
@Autowired
DepartmentService departmentService;
@GetMapping("/test")
public String test()
{
return "test";
}
@PostMapping("/create")//json to javaobject
public ResponseEntity<?> adddepartment(@RequestBody Department department)
{
Department department1 = departmentService.createDepartment(department);
Optional optional= departmentService.getDepartmentById((department.getDeptId()));
if(optional.isPresent()) {
	System.out.println(optional.get());
	return ResponseEntity.status(400).body("record already exists");
}
if(department!=null)
return ResponseEntity.status(201).body(department);
else
	return ResponseEntity.status(400).body("details are not proper");
//javaobject to json
}

}

