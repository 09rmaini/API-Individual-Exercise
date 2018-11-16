package com.qa.persistance.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity(name= "table2")
@Table(name="table2")

public class Account2 {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="trainee_id")
	private Long trainee_id;
	
	@Column(length=25)
	private String trainee_name;
	
	
	public Account2() {
		
	}


	public Long getTrainee_id() {
		return trainee_id;
	}


	public void setTrainee_id(Long trainee_id) {
		this.trainee_id = trainee_id;
	}


	public String getTrainee_name() {
		return trainee_name;
	}


	public void setTrainee_name(String trainee_name) {
		this.trainee_name = trainee_name;
	}

	
	

}