package com.example.tasklist.web.controllers;

import com.example.tasklist.domain.task.Task;
import com.example.tasklist.domain.user.User;
import com.example.tasklist.services.TaskService;
import com.example.tasklist.services.UserService;
import com.example.tasklist.web.dto.task.TaskDTO;
import com.example.tasklist.web.dto.user.UserDTO;
import com.example.tasklist.web.dto.validation.OnCreate;
import com.example.tasklist.web.dto.validation.OnUpdate;
import com.example.tasklist.web.mappers.TaskMapper;
import com.example.tasklist.web.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
@Validated
public class UserController {

    private final UserService userService;
    private final TaskService taskService;

    private final UserMapper userMapper;
    private final TaskMapper taskMapper;

    @PutMapping
    public UserDTO update(@Validated(OnUpdate.class) @RequestBody UserDTO userDTO){
        User user = userMapper.toEntity(userDTO);
        User updatedUser = userService.update(user);
        return userMapper.toDto(updatedUser);
    }

    @GetMapping("/{id}")
    public UserDTO getById(@PathVariable Long id){
        User user= userService.getById(id);
        return userMapper.toDto(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        userService.delete(id);
    }

    @GetMapping("/{id}/tasks")
    public List<TaskDTO> getTasksByUserId(@PathVariable Long id){
        List<Task>tasks = taskService.getAllByUserId(id);
        return taskMapper.toDto(tasks);
    }

@PostMapping("/{id}/tasks")
    public TaskDTO createTask(@PathVariable Long id, @Validated(OnCreate.class) @RequestBody TaskDTO dto){
        Task task = taskMapper.toEntity(dto);
        Task createdTask = taskService.create(task,id);
        return taskMapper.toDto(createdTask);
}

}
