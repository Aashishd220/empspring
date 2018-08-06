package com.cg.controller;

import java.util.List;

import com.cg.employee.Employee;
import com.cg.employeeservice.EmployeeService;

public class Controller {
	EmployeeService employeeService;

	public void setEmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public void addEmployee() {
		employeeService.addEmployee();
	}

	public List<Employee> viewAllEmployee() {
		return employeeService.viewAllEmployee();
	}

	public Employee viewEmployeeById(int id) {
		return employeeService.viewEmployeeById(id);
	}

	public List<Employee> deleteEmployeeById(int id) {
		return employeeService.deleteEmployeeById(id);
	}
}
