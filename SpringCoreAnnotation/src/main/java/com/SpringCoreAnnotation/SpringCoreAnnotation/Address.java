package com.SpringCoreAnnotation.SpringCoreAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private int hno;
	private String colony;
	private String city;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address(int hno, String colony, String city) {
		super();
		this.hno = hno;
		this.colony = colony;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", colony=" + colony + ", city=" + city + "]";
	}
	

}
