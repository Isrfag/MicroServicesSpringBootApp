package com.microservice.workers.services;

import com.microservice.workers.entities.WorkerEntity;

import java.util.List;


public interface IWorkerService {

    List<WorkerEntity> findAll();

    WorkerEntity findById(Long id);

    void save (WorkerEntity workerEntity);

    List<WorkerEntity> findByIdTask(Long idTask);
}
