package com.kasunyapa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee>{
	
	@Override
	public Employee mapRow(ResultSet rs,int rownum) throws SQLException {
		Employee e= new Employee();
		e.setEno(rs.getInt(1));
		e.setEname(rs.getString(2));
		e.setSalary(rs.getInt(3));
		e.setCity(rs.getString(4));
		return e;}
	
	

}
