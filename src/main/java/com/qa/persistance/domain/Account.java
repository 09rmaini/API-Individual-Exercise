package com.qa.persistance.domain;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity(name= "table1")
@Table(name="table1")

public class Account {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="ID")
	private Long classroom_id;
	
	@Column(length=25)
	private String trainer;
	
	@OneToMany
	@JoinColumn(name="trainee_id", referencedColumnName="ID")
	private List<Account2> traineesMap;
	
	public Account() {
		
	}

	public Long getClassroom_id() {
		return classroom_id;
	}

	public void setClassroom_id(Long classroom_id) {
		this.classroom_id = classroom_id;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	

	public List<Account2> getTraineesMap() {
		return traineesMap;
	}

	public void setTraineesMap(List<Account2> traineesMap) {
		this.traineesMap = traineesMap;
	}


	
	

}



