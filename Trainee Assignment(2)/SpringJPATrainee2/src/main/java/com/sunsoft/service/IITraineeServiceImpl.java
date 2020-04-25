package com.sunsoft.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunsoft.Entity.TraineeSpringJPA;
import com.sunsoft.Entity.User1;
import com.sunsoft.repository.AdminRepository;
import com.sunsoft.repository.ITraineeRepository;

@Service
public class IITraineeServiceImpl implements ITraineeService {

	@Autowired
	private ITraineeRepository traineeRepository;
	
	
	@Override
	public List<TraineeSpringJPA> getTrainees() {
		return traineeRepository.findAll();
	}

	@Override
	public void saveTrainee(TraineeSpringJPA theTrainee) {
		traineeRepository.save(theTrainee);
		
	}

	@Override
	public Optional<TraineeSpringJPA> getTrainee(int theId) {
		Optional<TraineeSpringJPA> obj = traineeRepository.findById(theId);
		return obj;
	}
	
	@Override
	@Transactional
	public void deleteTrainee(int theId) {
		traineeRepository.deleteById(theId);
		
	}

}
