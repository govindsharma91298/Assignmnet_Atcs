package com.ia.springcore;

public class Address {
	
	private int housenum;
	private String colonyname;
	private String city;
	public int getHousenum() {
		return housenum;
	}
	public void setHousenum(int housenum) {
		this.housenum = housenum;
	}
	public String getColonyname() {
		return colonyname;
	}
	public void setColonyname(String colonyname) {
		this.colonyname = colonyname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int housenum, String colonyname, String city) {
		super();
		this.housenum = housenum;
		this.colonyname = colonyname;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [housenum=" + housenum + ", colonyname=" + colonyname + ", city=" + city + "]";
	}
	
	

}
