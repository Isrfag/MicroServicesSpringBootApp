package com.microservice.workers.controllers;

import com.microservice.workers.entities.WorkerEntity;
import com.microservice.workers.services.IWorkerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/workers")
public class WorkerController {

    private final IWorkerService workerService;

    public WorkerController (IWorkerService workerService) {

        this.workerService = workerService;
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<WorkerEntity> findById (@PathVariable Long id) {
         return new ResponseEntity<>(workerService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/search/all")
    public ResponseEntity<List<WorkerEntity>> findAllWorkers () {
        return new ResponseEntity<>(workerService.findAll(),HttpStatus.OK);
    }

    @GetMapping("/search-by-task/{taskId}")
    public ResponseEntity<List<WorkerEntity>> findByTaskId (@PathVariable Long taskId) {
        return new ResponseEntity<>(workerService.findByIdTask(taskId),HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Void> saveWorker (@RequestBody WorkerEntity worker) {
        workerService.save(worker);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }
}
