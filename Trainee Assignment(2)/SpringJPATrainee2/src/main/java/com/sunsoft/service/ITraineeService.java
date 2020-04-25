package com.sunsoft.service;

import java.util.List;
import java.util.Optional;

import com.sunsoft.Entity.User1;
import com.sunsoft.Entity.TraineeSpringJPA;

public interface ITraineeService {

	
	public List <TraineeSpringJPA> getTrainees();
	public void saveTrainee(TraineeSpringJPA theTrainee);
	public Optional <TraineeSpringJPA> getTrainee(int theId);
	public void deleteTrainee(int theId);
}
