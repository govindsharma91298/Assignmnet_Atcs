package com.ia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ia.entity.Trainee;
import com.ia.service.TraineeService;

@RestController
@RequestMapping("/trainee")//http://localhost:4455/trainee
public class TraineeController {
	
	@Autowired
	TraineeService service;
	
	
	@PostMapping("/addTrainee")//http://localhost:4455/trainee/addTrainee
	public Trainee addTrainee(@RequestBody Trainee t) {
		return service.addTrainee(t);
		
	}
	
	@PutMapping("/updateTrainee")//http://localhost:4455/trainee/updateTrainee
	public Trainee updateTrainee(@RequestBody Trainee t) {
		return service.updateTrainee(t);
	}
	
	@GetMapping("/getTrainee/{id}")//http://localhost:4455/trainee/getTrainee/id
	public Trainee getTrainee(@PathVariable("id") int tid) {
		return service.getTrainee(tid);

}
	@GetMapping("/getAllTrainees")//http://localhost:4455/trainee/getAllTrainees
	public List<Trainee> getAllTrainee(){
		return service.getAllTrainees();
	}
	@DeleteMapping("/deleteTrainee/{id}")//http://localhost:4455/trainee/deleteTrainee/id
	public String deleteTrainee(@PathVariable("id") int tid)
	{
		return service.deleteTrainee(tid);
}
}
