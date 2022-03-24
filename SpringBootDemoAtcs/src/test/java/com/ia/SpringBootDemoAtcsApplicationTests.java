package com.ia;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ia.entity.Employee;
import com.ia.service.EmployeeService;

@SpringBootTest
class SpringBootDemoAtcsApplicationTests {

	@Autowired
	EmployeeService service;
	
//	@Test
//	void testAddEmployee() {
//		
//		Employee employee=new Employee(111, "mehul", 1520, "jaipur");
//		
//		Employee emp=service.addEmployee(employee);
//		
//		assertEquals(emp.getEmpName(),"mehul");
//	}
//	@Test
//	void testUpdateEmployee() {
//		
//		Employee employee=new Employee(111, "sathya", 1520, "jaipur");
//		
//		Employee emp=service.updateEmployee(employee);
//		
//		assertEquals(emp.getEmpName(),"sathya");
//	}
//
//	
//	@Test
//	void testDeleteEmployee() {
//		
//		String emp=service.deleteEmployee(111);
//		assertEquals(emp,"employee deleted");
//	}
	
	@Test
	void testGetAllEmployee() {
		List<Employee> emp=service.getAllEmployees();
		assertTrue(emp.size()>0);
	}
	
	
}

	
	
	

