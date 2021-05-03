package com.kasunyapa.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kasunyapa.dao.Employee;
import com.kasunyapa.dao.EmployeeDAO;

public class Main {


	public static void main(String[] args) {
		
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAO dao=(EmployeeDAO)ac.getBean("edao");
		
		Employee e=new Employee(19, "dasun", 20000, "colombo");
		
		boolean b=dao.addEmployee(e);
		
		if(b) {
			System.out.println(" Employee Added");
		}else {
			System.out.println("Error");
		}

	}
	
	
}
