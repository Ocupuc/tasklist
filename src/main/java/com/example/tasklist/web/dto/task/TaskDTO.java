package com.example.tasklist.web.dto.task;

import com.example.tasklist.domain.task.Status;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskDTO {

    private Long id;
    private String title;
    private String description;
    private Status status;
    private LocalDateTime expiration;

}
