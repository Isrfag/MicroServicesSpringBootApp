package com.microservice.tasks.repositories;

import com.microservice.tasks.entities.TaskEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaskRepository extends CrudRepository<TaskEntity, Long> {

}
