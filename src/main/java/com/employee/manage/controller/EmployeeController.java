package com.employee.manage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.manage.domain.Employee;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

	@GetMapping("/getEmployee")
	public Employee getEmployeeDetails() {
		Employee employee= new Employee();
		employee.setEmployeeId(12);
		employee.setFistName("SAMPATH");
		employee.setMiddleName("KUMAR");
		employee.setLastName("BANTU");
		employee.setAge(24);
		return employee;
	}
}
