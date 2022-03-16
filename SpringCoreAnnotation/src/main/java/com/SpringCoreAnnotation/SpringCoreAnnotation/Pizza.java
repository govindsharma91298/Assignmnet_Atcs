package com.SpringCoreAnnotation.SpringCoreAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Pizza {
	
	private int pizzano;
	private int price;
	
	@Autowired
	Address add;
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	public int getPizzano() {
		return pizzano;
	}
	public void setPizzano(int pizzano) {
		this.pizzano = pizzano;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Address getAdd() {
		return add;
	}
	@Autowired
	public void setAdd(Address add) {
		this.add = add;
	}
	public Pizza(int pizzano, int price, Address add) {
		super();
		this.pizzano = pizzano;
		this.price = price;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Pizza [pizzano=" + pizzano + ", price=" + price + ", add=" + add + "]";
	}
	
	

}
