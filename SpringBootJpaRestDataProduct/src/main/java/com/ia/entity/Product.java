package com.ia.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int pid;
	private String pname;
	private int price;
	private int pdel;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPdel() {
		return pdel;
	}
	public void setPdel(int pdel) {
		this.pdel = pdel;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, int price, int pdel) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.pdel = pdel;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", pdel=" + pdel + "]";
	}
	
	

}
