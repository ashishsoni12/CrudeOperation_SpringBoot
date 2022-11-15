package com.example.CrudeProject.service;

import com.example.CrudeProject.dao.UserRepository;
import com.example.CrudeProject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
  private UserRepository userRepository;
    public User createUser(User user)
    {
        return userRepository.save(user);
    }
    public List<User> createUsers(List<User> users)
    {
        return userRepository.saveAll(users);
    }

    public User getUserById(int id)
    {
        return userRepository.findById(id).orElse(null);
    }
    public List<User> getUsers()
    {
        return userRepository.findAll();
    }
    public User updateUser(User user)
    {
        return userRepository.save(user);
    }
    public String deleteUserById(int id)
    {
        userRepository.deleteById(id);
        return "user got deleted";
    }
}
