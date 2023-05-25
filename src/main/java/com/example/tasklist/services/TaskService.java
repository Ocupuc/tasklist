package com.example.tasklist.services;

import com.example.tasklist.domain.task.Task;

import java.util.List;

public interface TaskService {

    Task getById(Long id);

    List<Task> getAllByUserId(Long id);

    Task create(Task task, Long id);

    Task update(Task task);

    void  delete(Long id);


}
