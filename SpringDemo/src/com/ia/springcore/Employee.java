package com.ia.springcore;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int empid;
	private String empname;
	private int empsal;
	
	@Autowired
	Address add;

	

	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getEmpname() {
		return empname;
	}



	public void setEmpname(String empname) {
		this.empname = empname;
	}



	public int getEmpsal() {
		return empsal;
	}



	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}



	public Address getAdd() {
		return add;
	}



	public void setAdd(Address add) {
		this.add = add;
	}



	public Employee() {
		// TODO Auto-generated constructor stub
	}

	

	public Employee(int empid, String empname, int empsal, Address add) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.add = add;
	}



	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", add=" + add + "]";
	}

	
	 
//	
//	public void display() {
//		
//		System.out.println("empid= "+empid+"empname= "+empname+"empsal= "+empsal);
//		
//	}
	

}
