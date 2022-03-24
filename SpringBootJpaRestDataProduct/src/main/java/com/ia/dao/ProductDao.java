package com.ia.dao;

import org.springframework.data.repository.CrudRepository;

import com.ia.entity.Product;

public interface ProductDao extends CrudRepository<Product, Integer> {

}
