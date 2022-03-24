package com.ia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ia.dao.ProductDao;
import com.ia.entity.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	
	@Autowired 
	ProductDao dao;

	@Override
	public Product addProduct(Product p) {
		
		return dao.save(p);
	}

	@Override
	public Product updateProduct(Product p) {
		
		return dao.save(p);
	}

	@Override
	public void deleteProduct(int pid) {
	
		 dao.deleteById(pid);
	}

	@Override
	public Optional<Product> getProduct(int pid) {
		
		return dao.findById(pid);
	}

	@Override
	public Iterable<Product> getAllProduct() {
		
		return dao.findAll();
	}
	
	
	
	
	
	

}
