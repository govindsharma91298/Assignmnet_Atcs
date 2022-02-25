package service;
import java.util.Map.Entry;
import java.util.Set;
import dao.*;
import entity.Trainee;

public class TraineeServiceImp implements TraineeService{

	TraineeDao Td = new TraineeDaoImpl();
	
	@Override
	public int addTrainee(Trainee t) {
		int Tid = Td.addTrainee(t);
		return Tid;
	}

	@Override
	public Trainee updateTrainee(int Tid, Trainee t) {
		
		return Td.updateTrainee(Tid, t); 
	}

	@Override
	public void deleteTrainee(int Tid) {
		
		Td.deleteTrainee(Tid);
		
	}

	@Override
	public Trainee getTrainee(int Tid) {
		
		return Td.getTrainee(Tid);
	}

	@Override
	public Set<Entry<Integer, Trainee>> getAllTrainees() {
		
		return Td.getAllTrainees();
	}
	
	
}
