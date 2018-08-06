package com.cg.employeedao;

import java.util.ArrayList;
import java.util.List;

import com.cg.employee.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	Employee employee;
	List<Employee> employeeList = new ArrayList<>();
	
	/* (non-Javadoc)
	 * @see com.cg.employeedao.EmployeeDao#addEmployee(com.cg.employee.Employee)
	 */
	@Override
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	/* (non-Javadoc)
	 * @see com.cg.employeedao.EmployeeDao#viewAllEmployee()
	 */
	@Override
	public List<Employee> viewAllEmployee()
	{
		return employeeList;
		
	}
	/* (non-Javadoc)
	 * @see com.cg.employeedao.EmployeeDao#viewEmployeeById(int)
	 */
	@Override
	public Employee viewEmployeeById(int id) {
		
		for(Employee trav:employeeList) {
			if(employee.getId()==id)
			{
				employee=employee;
			}
			
		}
		return employee;
		
	}
	/* (non-Javadoc)
	 * @see com.cg.employeedao.EmployeeDao#deleteEmployeeById(int)
	 */
	@Override
	public List<Employee> deleteEmployeeById(int id) {
		for(Employee traverse:employeeList) {
			if(employee.getId()==id)
			{
			employeeList.remove(id);
			}
		}
		
		return employeeList;
	}
}

