package com.dantas.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dantas.backend.models.User;
import com.dantas.backend.repository.UserRepository;

@Service
public class UserSericeImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);

    }

    @Override
    public List<User> getUsers() {
        return (List<User>) userRepo.findAll();
    }

    @Override
    public User getUserById(long id) {
        return userRepo.findById(id).get();
    }

    @Override
    public void deleteUser(long id) {
        userRepo.deleteById(id);
    }

    @Override
    public User updateUser(User user, long id) {
        User olduser = userRepo.findById(id).get();
        olduser.setEmail(user.getEmail());
        olduser.setName(user.getName());
        olduser.setPassword(user.getPassword());
        olduser.setComment(user.getComment());
        return userRepo.save(olduser);
    }

}
