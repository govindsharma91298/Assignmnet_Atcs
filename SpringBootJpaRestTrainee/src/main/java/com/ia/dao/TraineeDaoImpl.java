package com.ia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import com.ia.entity.Trainee;

@Repository
public class TraineeDaoImpl implements TraineeDao {
	
	@PersistenceContext
	EntityManager entity;

	@Override
	public Trainee addTrainee(Trainee t) {
		entity.persist(t);
		return entity.find(Trainee.class, t.getTid());
	}

	@Override
	public Trainee updateTrainee(Trainee t) {
		
		return entity.merge(t);
	}

	@Override
	public String deleteTrainee(int tid) {
		Trainee tr = entity.find(Trainee.class, tid);

		if (tr != null) {
			entity.remove(tr);
			return "Trainee deleted";
		} else {
			return "no Trainee found";
		}
	}
	

	@Override
	public Trainee getTrainee(int tid) {
		
		return entity.find(Trainee.class, tid);
	}

	@Override
	public List<Trainee> getAllTrainees() {
	
		TypedQuery<Trainee> result = entity.createQuery("select t from Trainee t", Trainee.class);
		return result.getResultList();
	}
	
	

}
