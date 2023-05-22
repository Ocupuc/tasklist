package com.example.tasklist.repositories;

import com.example.tasklist.domain.task.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    Optional<Task> findById(Long id);

    List<Task> findAllByUserId(Long userId);

    void assignToUserById(Long taskId, Long userId);  //связывает задачу с указанным пользователем

    void create(Task task);

    void update(Task task);

    void delete(Long id);
}
