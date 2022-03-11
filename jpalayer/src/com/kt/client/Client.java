package com.kt.client;

import com.kt.entity.Employee;
import com.kt.service.EmployeeService;
import com.kt.service.EmployeeServiceImpl;

public class Client {
	

	public static void main(String[] args) {
		
		EmployeeService service= new EmployeeServiceImpl();
		
		Employee employee= new Employee(111, "keerthi", 90000, "usa");
		
		service.addEmployee(employee);
		
		employee=service.findEmployeeById(111);
	System.out.println("id:" +employee.getEmpid());
		System.out.println("name :"+employee.getEmpname());
		System.out.println("salary :"+employee.getEmpsal());
		
//update
		
		employee.setEmpname("tarun");
		employee.setEmpadd("hyd");
		employee.setEmpsal(20000);
		
		service.updateEmployee(employee);		
		 employee=service.findEmployeeById(111);
		System.out.println("updated id:"+employee.getEmpname());
		System.out.println("updated id:"+employee.getEmpadd());
		 System.out.println("updated id:"+employee.getEmpsal());
		
		

		service.deleteEmployee(employee);
	System.out.println("end of program");
		
	}
	

}

