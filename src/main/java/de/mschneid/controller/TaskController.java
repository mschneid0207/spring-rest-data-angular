package de.mschneid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.mschneid.entity.Task;
import de.mschneid.repository.TaskRepository;

@RestController
public class TaskController {
	
	@Autowired
	private TaskRepository taskRepository;

	@RequestMapping("/task/{id}")
	public Task getTask(@PathVariable String id) {
		System.out.println("id: " + id);
		
		Task retTask = new Task();
		retTask.setId(2);
		retTask.setDescription("Example");
		return retTask;
		
	}

}
