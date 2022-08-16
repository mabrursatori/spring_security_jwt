package com.mabrur.security.service;

import java.util.List;

import com.mabrur.security.domain.Role;
import com.mabrur.security.domain.User;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers(); 
}
