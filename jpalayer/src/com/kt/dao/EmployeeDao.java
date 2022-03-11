package com.kt.dao;

import com.kt.entity.Employee;

public interface EmployeeDao {

	

	Employee getEmployeeById(int id);
	
	void addEmployee(Employee employee);
	
	void updateEmployee(Employee employee);
	
	void deleteEmployee(Employee employee);
	
	void commitTransaction();
	
	void beginTransaction();
	
	
}
