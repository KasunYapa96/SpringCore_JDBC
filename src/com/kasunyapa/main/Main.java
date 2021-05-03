package com.kasunyapa.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kasunyapa.dao.Employee;
import com.kasunyapa.dao.EmployeeDAO;

public class Main {


	public static void main(String[] args) {
		
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAO dao=(EmployeeDAO)ac.getBean("edao");
		
		Employee e=new Employee(13, "Monash", 90000, "colombo");
		
		boolean b=dao.addEmployee(e);
		
		if(b) {
			System.out.println(" Employee Added");
		}else {
			System.out.println("Error");
		}

		
		List<Employee> list=dao.getAllEmployees();
		System.out.println("-------------------Employees list-------------");
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		
	}
	
	
}
