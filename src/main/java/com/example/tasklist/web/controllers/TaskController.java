package com.example.tasklist.web.controllers;

import com.example.tasklist.domain.task.Task;
import com.example.tasklist.services.TaskService;
import com.example.tasklist.web.dto.task.TaskDTO;
import com.example.tasklist.web.dto.validation.OnUpdate;
import com.example.tasklist.web.mappers.TaskMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tasks")
@RequiredArgsConstructor
@Validated
public class TaskController {

    private final TaskService taskService;

    private final TaskMapper taskMapper;

    @PutMapping   // сюда идет запрос в котором есть тело в котором есть json TaskDTO и все поля в нем(dto) помеченные OnUpdate @Validated будет проверять до попадания в контроллер
    public TaskDTO update(@Validated(OnUpdate.class) @RequestBody TaskDTO dto){
        Task task = taskMapper.toEntity(dto);
        Task updatedTask = taskService.update(task);
        return taskMapper.toDto(updatedTask);
    }

    @GetMapping("/{id}")
    public TaskDTO getById(@PathVariable Long id){
        Task task = taskService.getById(id);
        return taskMapper.toDto(task);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        taskService.delete(id);
    }
}
