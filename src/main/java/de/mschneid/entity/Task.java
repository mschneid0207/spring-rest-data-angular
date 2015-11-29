package de.mschneid.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TASK")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	@Column(name= "task_description")
	private String description;
	@Column(name= "task_priority")
	private String priority;
	@Column(name= "task_status")
	private String status;
	@Column(name= "task_archived")
	private boolean isArchived;

}
