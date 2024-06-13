package com.microservice.tasks.client;

import com.microservice.tasks.dtos.WorkerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "restaurant-workers", url = "localhost:8080/api/workers")
public interface WorkerClient {

    @GetMapping("/search-by-task/{taskId}")
    List<WorkerDto> findAllWorkersByTask(@PathVariable Long taskId);
}
