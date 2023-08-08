package com.thales.repository;

import java.util.List;

import com.thales.entity.Employee;

public interface IEmployeeRepository {
	
	public List<Employee> getEmployees();
	public Employee getEmployeeById(String id);
	

}
