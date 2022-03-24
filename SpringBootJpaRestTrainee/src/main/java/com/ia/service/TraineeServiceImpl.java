package com.ia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ia.dao.TraineeDao;
import com.ia.entity.Trainee;

@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {
	
	@Autowired
	TraineeDao dao;

	@Override
	public Trainee addTrainee(Trainee t) {
		
		return dao.addTrainee(t);
	}

	@Override
	public Trainee updateTrainee(Trainee t) {
		
		return dao.updateTrainee(t);
	}

	@Override
	public String deleteTrainee(int tid) {
		
		return dao.deleteTrainee(tid);
	}

	@Override
	public Trainee getTrainee(int tid) {
		// TODO Auto-generated method stub
		return dao.getTrainee(tid);
	}

	@Override
	public List<Trainee> getAllTrainees() {
		
		return dao.getAllTrainees();
	}
	
	

}
