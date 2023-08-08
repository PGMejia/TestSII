package com.thales.service;

import java.util.List;

import com.thales.entity.Employee;

public interface IEmployeeService {
	
	public double anualSalary(double salary);

	public List<Employee> getEmployees();
	public Employee getEmployeeById(String id);
	
}
