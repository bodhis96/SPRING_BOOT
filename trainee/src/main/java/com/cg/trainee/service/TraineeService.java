package com.cg.trainee.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.cg.trainee.model.Trainee;
@Service("traineeService")

public interface TraineeService  {
	
	public List<Trainee> findAll();
	
	public void save( Trainee trainee);
	
	public void delete(Trainee trainee);
	public  Trainee findById(Integer id);
	

	
	
	
	
}

