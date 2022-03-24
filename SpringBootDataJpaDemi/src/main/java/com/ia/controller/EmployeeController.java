package com.ia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ia.entity.Employee;
import com.ia.service.EmployeeService;



@RestController
@RequestMapping("/employee")//http://localhost:8081/employee
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/addEmployee")//http://localhost:8081/employee/addEmployee
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}
	@PutMapping("/updateEmployee")//http://localhost:8081/employee/updateEmployee
	public Employee updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
		
	}
	@GetMapping("/getEmployee/{eid}")//http://localhost:8081/employee/getEmployee/eid
	public Optional<Employee> getEmployee(@PathVariable("eid") int empId) {
		return service.getEmployee(empId);
	}
	@GetMapping("/getAllEmployees")//http://localhost:8081/employee/getAllEmployees
	public Iterable<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
    @DeleteMapping("/deleteEmployee/{eid}")//http://localhost:8081/employee/deleteEmployee/eid
    public void deleteEmployee(@PathVariable("eid") int empId)
    {
    	 service.deleteEmployee(empId);
    }
}
