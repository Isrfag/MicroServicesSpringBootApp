package com.microservice.workers.services;

import com.microservice.workers.entities.WorkerEntity;
import com.microservice.workers.repositories.IWorkerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements IWorkerService {

    private final IWorkerRepository wRepo;

    public WorkerServiceImpl(IWorkerRepository wRepo) {
        this.wRepo = wRepo;
    }
    @Override
    public List<WorkerEntity> findAll() {
        return (List<WorkerEntity>) wRepo.findAll();
    }

    @Override
    public WorkerEntity findById(Long id) {
        return wRepo.findById(id).orElseThrow(); //Pq devuelve optional
    }

    @Override
    public void save(WorkerEntity workerEntity) {
        wRepo.save(workerEntity);
    }

    @Override
    public List<WorkerEntity> findByIdTask(Long idTask) {
        return wRepo.findAllBytaskId(idTask);
    }
}
