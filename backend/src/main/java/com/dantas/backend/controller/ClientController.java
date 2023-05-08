package com.dantas.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.dantas.backend.models.User;
import com.dantas.backend.service.UserService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ClientController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String getMethodName() {
        return "oi";
    }

    @PostMapping(value = "/add")
    public User createUser(@RequestBody User user) {
        User user1 = userService.createUser(user);
        return user1;
    }

    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PutMapping(value = "/update/{id}")
    public User updateUserById(@PathVariable("id") long id, @RequestBody User user) {
        return userService.updateUser(user, id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        userService.deleteUser(id);
        return "User Deleted Successfully.";
    }

    @GetMapping(value = "/user/{id}")
    public User getUserById(@PathVariable("id") long id) {
        return userService.getUserById(id);
    }

}
