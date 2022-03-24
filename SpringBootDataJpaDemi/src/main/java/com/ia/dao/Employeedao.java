package com.ia.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ia.entity.Employee;

public interface Employeedao extends CrudRepository<Employee, Integer> {

	
}
