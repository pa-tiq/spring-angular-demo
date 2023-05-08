package com.dantas.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dantas.backend.models.User;

@Service
public interface UserService {

    public User createUser(User user);

    public List<User> getUsers();

    public User getUserById(long id);

    public void deleteUser(long id);

    public User updateUser(User user, long id);
}
