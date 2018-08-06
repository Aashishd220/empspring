package com.cg.employeedao;

import java.util.List;

import com.cg.employee.Employee;

public interface EmployeeDao {

	/**
	 * @param employee
	 */
	void addEmployee(Employee employee);

	/**
	 * @return
	 */
	List<Employee> viewAllEmployee();

	/**
	 * @param id
	 * @return
	 */
	Employee viewEmployeeById(int id);

	/**
	 * @param id
	 * @return
	 */
	List<Employee> deleteEmployeeById(int id);

}