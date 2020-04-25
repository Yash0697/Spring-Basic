package com.sunsoft.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TraineeSpringJPA")
public class TraineeSpringJPA {

	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	//@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	@Column(name = "traineeId")
	private int traineeId;
	
	@Column(name = "traineeName")
	public String traineeName;
	
	@Column(name = "traineeDomain")
	public String traineeDomain;
	
	@Column(name = "traineeLocation")
	public String traineeLocation;
	
	public TraineeSpringJPA(){}

	
	public int getTraineeId() {
		return traineeId;
	}


	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}


	public String getTraineeName() {
		return traineeName;
	}


	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}


	public String getTraineeDomain() {
		return traineeDomain;
	}


	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}


	public String getTraineeLocation() {
		return traineeLocation;
	}


	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}


	@Override
	public String toString() {
		return "Employee [id = " + traineeId + ", Name = " + traineeName + ", domain = " + traineeDomain + ", Location = " + traineeLocation + " ]";
	}
	
	
}
