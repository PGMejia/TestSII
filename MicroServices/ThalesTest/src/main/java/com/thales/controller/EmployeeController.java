package com.thales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.thales.entity.Employee;
import com.thales.service.IEmployeeService;

@CrossOrigin
@RestController
public class EmployeeController {

	
	 	@Autowired
	    private IEmployeeService employeeService;

	    @GetMapping("/employees")
	    public ResponseEntity<List<Employee>> getEmployees() {
	        return ResponseEntity.ok(employeeService.getEmployees());
	    }

	    @GetMapping("/employees/{id}")
	    public Employee getEmployeeById(@PathVariable String id) {
	        return employeeService.getEmployeeById(id);
	    }
}
