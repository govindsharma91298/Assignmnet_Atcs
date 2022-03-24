package com.ia.controller;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ia.entity.Product;
import com.ia.service.ProductService;

@RestController
@RequestMapping("/product")//http://localhost:8082/product
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@PostMapping("/addProduct")//http://localhost:8082/product/addProduct
	public Product addProduct(@RequestBody Product p)
	{
		return service.addProduct(p);
	}
	@PutMapping("/updateProduct")//http://localhost:8082/product/updateProduct
	public Product updateProduct(@RequestBody Product p)
	{
		return service.updateProduct(p);
	}
	@GetMapping("/getProduct/{id}")//http://localhost:8082/product/getProduct/id
	public Optional<Product> getProduct(@PathVariable("id") int p)
	{
		return service.getProduct(p);
	}
	@GetMapping("/getAllProduct")//http://localhost:8082/product/getAllProduct
	public Iterable<Product> getAllProduct()
	{
		return service.getAllProduct();
	}
	@DeleteMapping("/deleteProduct/{id}")//http://localhost:8082/product/addProduct/id
	public void deleteProduct(@PathVariable("id")  int p)
	{
		 service.deleteProduct(p);
	}
	
}
