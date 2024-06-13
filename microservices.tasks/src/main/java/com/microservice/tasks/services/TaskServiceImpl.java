package com.microservice.tasks.services;

import com.microservice.tasks.client.WorkerClient;
import com.microservice.tasks.dtos.WorkerDto;
import com.microservice.tasks.entities.TaskEntity;
import com.microservice.tasks.http.response.WorkerByTaskResponse;
import com.microservice.tasks.repositories.ITaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements  ITaskService{
    private final ITaskRepository repository;
    private final WorkerClient workerClient;
    public TaskServiceImpl (ITaskRepository repository, WorkerClient workerClient) {

        this.repository = repository;
        this.workerClient = workerClient;
    }
    @Override
    public List<TaskEntity> findAll() {
        return (List<TaskEntity>) repository.findAll();
    }

    @Override
    public TaskEntity findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public void save(TaskEntity task) {
        repository.save(task);
    }

    @Override
    public WorkerByTaskResponse findWorkersByIdTask(Long idTask) {
        //Consultamos la tarea
        TaskEntity task = repository.findById(idTask).orElse(new TaskEntity());

        //Obtenemos los trabajadores usando el cliente de trabajadores
        List<WorkerDto> workerDtoList = workerClient.findAllWorkersByTask(idTask);

        //Construimos la respuesta con los datos que tenemos
        return WorkerByTaskResponse.builder()
                .taskName(task.getName())
                .workLoad(task.getWorkLoad())
                .workerDtoList(workerDtoList)
                .build();
    }
}
