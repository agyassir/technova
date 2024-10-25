package com.example.technova.Service;

import com.example.technova.Entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getAllUsers();
}
