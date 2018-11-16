package com.qa.classroom.persistance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity 

public class Trainee {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Traineeid; 
	
	@Column(length = 100)
	private String Trainee_name;
	
	

	public long getTraineeid() {
		return Traineeid;
	}

	public void setTraineeid(long traineeid) {
		Traineeid = traineeid;
	}

	public String getTrainee_name() {
		return Trainee_name;
	}

	public void setTrainee_name(String trainee_name) {
		Trainee_name = trainee_name;
	}

	public Trainee() {
		super();
		
	}

	public Trainee(long traineeid, String trainee_name) {
		super();
		Traineeid = traineeid;
		Trainee_name = trainee_name;
	} 
	
	
	

}
