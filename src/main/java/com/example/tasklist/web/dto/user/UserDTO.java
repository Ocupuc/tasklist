package com.example.tasklist.web.dto.user;

import com.example.tasklist.domain.task.Task;
import com.example.tasklist.domain.user.Role;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class UserDTO {

    private Long id;
    private String name;
    private String userName;
    private String password;
    private String passwordConfirmation;

}
