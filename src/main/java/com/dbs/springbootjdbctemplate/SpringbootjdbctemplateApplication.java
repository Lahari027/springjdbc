package com.dbs.springbootjdbctemplate;
import javax.sql.DataSource;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dbs.springbootjdbctemplate.dto.Department;
import com.dbs.springbootjdbctemplate.dto.Employee;
import com.dbs.springbootjdbctemplate.service.DepartmentService;
import com.dbs.springbootjdbctemplate.service.EmployeeService;
@SpringBootApplication
public class SpringbootjdbctemplateApplication {
    public static void main(String[] args) {
    ApplicationContext  applicationContext =SpringApplication.run(SpringbootjdbctemplateApplication.class, args);
    /*DataSource dataSource = applicationContext.getBean(DataSource.class);
    System.out.println(dataSource!=null);
    EmployeeService employeeServic =applicationContext.getBean(EmployeeService.class);
    
    Employee employee= new Employee("21","lahari","todupunuri",100.0f,"HYD");
  Employee employee2=employeeServic.createEmployee(employee);
  System.out.println(employee2);
  Optional<Employee> optional= employeeServic.getEmployeeById("136");
  if(optional.isPresent()) {
	  System.out.println(optional.get());
  }
  else {
	  System.out.println("record not found");
  }
  System.out.println("Emp by last name");
  Optional<List<Employee>> optional2= employeeServic.getEmployeeByLastName("todupunuri");
  if(optional2.isPresent()) {
	  System.out.println(optional2.get());
  }
  else {
	  System.out.println("record not found");
  }
 /* System.out.println("byId and last name call");
  Optional<Employee> optional3= employeeServic.getEmployeesByIdAndLastname("1","todupunuri");
  System.out.println(optional3.get());
System.out.println("Department");
DepartmentService departmentServic=applicationContext.getBean(DepartmentService.class);
System.out.println(departmentServic!=null);
Department department = new Department("IBGT","10",":Yd");
Department dep2=departmentServic.createDepartment(department);
System.out.println(dep2);
System.out.println("Depart by Id");
Optional<Department> dept= departmentServic.getDepartmentById("10");
if(dept.isEmpty()) {
	System.out.println("no dept found");
}
else {
	System.out.println(dept);
}
Optional<List<Department>> opt5= departmentServic.getDepartments();
if(opt5.isEmpty()) {
	System.out.println("Empty");
}
else {
	System.out.println(opt5);
}*/
    }
}
