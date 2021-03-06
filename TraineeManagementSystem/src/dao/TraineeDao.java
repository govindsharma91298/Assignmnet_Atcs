package dao;

import java.util.Set;
import java.util.Map.Entry;

import entity.Trainee;

public interface TraineeDao {
	
	int addTrainee(Trainee t);
	Trainee updateTrainee(int Tid, Trainee t);
	void deleteTrainee(int Tid);
	Trainee getTrainee(int Tid);
	Set<Entry<Integer,Trainee>> getAllTrainees();
	
}
