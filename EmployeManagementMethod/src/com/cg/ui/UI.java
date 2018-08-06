package com.cg.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.controller.Controller;
import com.cg.employee.Employee;

public class UI {

	ApplicationContext context=new ClassPathXmlApplicationContext("employee.xml");
	Controller appController=(Controller) context.getBean("appController");
	Employee employee=(Employee) context.getBean("employee");
	public void display()
	{
	 employee=new Employee(1,"aashish",213123);
	 System.out.println(appController.viewAllEmployee());
	}
}
