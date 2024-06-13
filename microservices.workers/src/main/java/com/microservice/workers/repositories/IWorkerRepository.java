package com.microservice.workers.repositories;

import com.microservice.workers.entities.WorkerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IWorkerRepository extends CrudRepository<WorkerEntity, Long> {

    List<WorkerEntity> findAllBytaskId(Long idTask);

}
