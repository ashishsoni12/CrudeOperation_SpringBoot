package com.example.CrudeProject.controller;

import com.example.CrudeProject.entity.User;
import com.example.CrudeProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
     private UserService userService;
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user)
    {
         return userService.createUser(user);
    }
    @PostMapping("/addUsers")
    public List<User> addUser( @RequestBody List<User> users)
    {
        return userService.createUsers(users);
    }
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id)
    {
        return userService.getUserById(id);
    }
    @GetMapping("/user")
    public List<User> getAllUsers()
    {
        return userService.getUsers();
    }
    @PutMapping("/updateuser/{id}")
    public User updateUser(@RequestBody  User user,@PathVariable int id)
    {

        user.setId(id);
        User updatedUser= userService.updateUser(user);
        return updatedUser;
    }
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id)
    {
        return userService.deleteUserById(id);
    }

}
