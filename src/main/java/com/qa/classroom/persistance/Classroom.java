package com.qa.classroom.persistance;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Classroom {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Classrooum_id")
	private Long id ; 
	@Column(length =100)
	private String trainer ; 
	
	@OneToMany
	@JoinColumn(name = "check_id", referencedColumnName="Classrooum_id")
	private List <Trainee> trainess;
	

	public Classroom(Long id, String trainer, List<Trainee> trainess) {
		
		this.id = id;
		this.trainer = trainer;
		this.trainess = trainess;
	}

	public Classroom() {
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public List<Trainee> getTrainess() {
		return trainess;
	}

	public void setTrainess(List<Trainee> trainess) {
		this.trainess = trainess;
	} 
	
	
	

}
