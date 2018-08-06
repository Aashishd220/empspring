package com.cg.employeeservice;

import java.util.List;

import com.cg.employee.Employee;
import com.cg.employeedao.EmployeeDaoImpl;

public class EmployeeService {

	EmployeeDaoImpl employeeDao;
	Employee employee;

	public void setAddEmployeeDao(EmployeeDaoImpl employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void addEmployee() {
		employeeDao.addEmployee(employee);

	}

	public List<Employee> viewAllEmployee() {
		return employeeDao.viewAllEmployee();
	}

	public Employee viewEmployeeById(int id) {
		return employeeDao.viewEmployeeById(id);
	}

	public List<Employee> deleteEmployeeById(int id) {
		return employeeDao.deleteEmployeeById(id);
	}
}
