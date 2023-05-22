package com.example.tasklist.repositories;

import com.example.tasklist.domain.user.Role;
import com.example.tasklist.domain.user.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(Long id);

    Optional<User> findByUsername(String username); //для проверки во время регистрации

    void create(User user);

    void update(User user);

    void insertUserRole(Long userId, Role role);// при регистрации пользователь должен получить роль

    boolean isTaskOwner(Long userId, Long taskId);

    void delete(Long id);

}
