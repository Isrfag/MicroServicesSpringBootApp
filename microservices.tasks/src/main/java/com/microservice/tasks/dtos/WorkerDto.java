package com.microservice.tasks.dtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkerDto {
    private String name;
    private String lastName;
    private String phone;
    private String contract;
    private Long salary;
    private Long taskId;
}
