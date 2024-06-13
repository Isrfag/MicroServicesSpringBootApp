package com.microservice.tasks.http.response;

import com.microservice.tasks.dtos.WorkerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkerByTaskResponse {

    private String taskName;
    private String workLoad;
    private List<WorkerDto> workerDtoList;
}
