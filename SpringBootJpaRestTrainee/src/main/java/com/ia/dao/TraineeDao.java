package com.ia.dao;

import java.util.List;

import com.ia.entity.Trainee;

public interface TraineeDao {
	
	Trainee addTrainee(Trainee t);
	
	Trainee updateTrainee(Trainee t);

	String deleteTrainee(int tid);

	Trainee getTrainee(int tid);

	List<Trainee> getAllTrainees();
}
