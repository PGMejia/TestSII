package com.thales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thales.entity.Employee;
import com.thales.repository.IEmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	IEmployeeRepository _employee;
	
	@Override
	public double anualSalary(double salary) {
		return salary * 12;
	}

	@Override
	public List<Employee> getEmployees() {
		return _employee.getEmployees();
	}

	@Override
	public Employee getEmployeeById(String id) {
		return _employee.getEmployeeById(id);
	}

}
