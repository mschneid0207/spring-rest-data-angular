package de.mschneid.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name="ID")

	private int id;
	private String description;
	private String priority;
	private String status;
	private boolean isArchived;
	
	
	
	 


}
