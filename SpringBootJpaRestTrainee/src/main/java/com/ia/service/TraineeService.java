package com.ia.service;

import java.util.List;


import com.ia.entity.Trainee;

public interface TraineeService {
	
	Trainee addTrainee(Trainee t);
	
	Trainee updateTrainee(Trainee t);

	String deleteTrainee(int tid);

	Trainee getTrainee(int tid);

	List<Trainee> getAllTrainees();


}
