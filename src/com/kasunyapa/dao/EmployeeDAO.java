package com.kasunyapa.dao;

import java.awt.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {

	JdbcTemplate jdbcTemplate;
	
	public EmployeeDAO() {}

//	public EmployeeDAO(JdbcTemplate jdbcTemplate) {
//		super();
//		this.jdbcTemplate = jdbcTemplate;
//	}
//
//
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
	
	
	public boolean addEmployee(Employee e) {
		
		String query ="insert into employee values(?,?,?,?)";
		int result=jdbcTemplate.update(query, e.getEno(),e.getEname(),e.getSalary(),e.getCity());
		return result>0?true:false;
	}
	
//	public List getAllEmployee() {
//		
//		
//	}
//	
	
	
}
