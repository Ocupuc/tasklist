package com.example.tasklist.services;

import com.example.tasklist.domain.user.User;
import com.example.tasklist.repositories.UserRepository;

public interface UserService {

    User getById(Long id);

    User getByUsername(String username);

    User create(User user);

    User update(User user);

    boolean isTaskOwner(Long userId, Long taskId);

    void delete(Long id);

}
