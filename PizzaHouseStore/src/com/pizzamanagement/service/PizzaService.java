package com.pizzamanagement.service;

import com.pizzamanagement.model.Pizza;

public interface PizzaService {
	
	
	void addPizza(Pizza p );
	void updatePizza(Pizza p);  // defining unimplemented methods
	void deletePizza(Pizza p);
	Pizza findPizzaByno(int pizzaNo);
	

}
