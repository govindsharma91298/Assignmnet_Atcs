package com.ia.service;

import java.util.List;
import java.util.Optional;

import com.ia.entity.Product;

public interface ProductService {
	
	Product addProduct(Product p);
	Product updateProduct(Product p);
	void deleteProduct(int pid);
	Optional<Product> getProduct(int pid);
	Iterable<Product> getAllProduct();

}
