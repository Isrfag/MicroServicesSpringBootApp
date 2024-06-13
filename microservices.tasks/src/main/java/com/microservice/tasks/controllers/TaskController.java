package com.microservice.tasks.controllers;

import com.microservice.tasks.dtos.WorkerDto;
import com.microservice.tasks.entities.TaskEntity;
import com.microservice.tasks.http.response.WorkerByTaskResponse;
import com.microservice.tasks.services.ITaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/tasks")
public class TaskController {

    private final ITaskService taskService;
    public TaskController (ITaskService taskService) {
        this.taskService= taskService;
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<TaskEntity> getTaskById (@PathVariable Long id) {
        return new ResponseEntity<>(taskService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<TaskEntity>> getAllTask () {
        return new ResponseEntity<>(taskService.findAll(),HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Void> saveTask (TaskEntity task) {
        taskService.save(task);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //End point para consumir el otro micro servicio
    @GetMapping("/search-worker/{taskId}")
    public ResponseEntity<WorkerByTaskResponse> findWorkersByIdTask (@PathVariable Long taskId) {
        return new ResponseEntity<>(taskService.findWorkersByIdTask(taskId),HttpStatus.OK);
    }
}
