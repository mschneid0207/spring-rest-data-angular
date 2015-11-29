package de.mschneid.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import de.mschneid.entity.Task;

@RepositoryRestResource
public interface TaskRepository extends CrudRepository<Task, Integer> {
	
	List<Task> findByStatus(@Param("status") String taskStatus);

}
