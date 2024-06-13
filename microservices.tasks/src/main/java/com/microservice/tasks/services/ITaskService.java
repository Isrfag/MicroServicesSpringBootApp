package com.microservice.tasks.services;

import com.microservice.tasks.entities.TaskEntity;
import com.microservice.tasks.http.response.WorkerByTaskResponse;

import java.util.List;

public interface ITaskService {

    List<TaskEntity> findAll();
    TaskEntity findById (Long id);
    void save(TaskEntity task);
    WorkerByTaskResponse findWorkersByIdTask (Long  idTask);

}
