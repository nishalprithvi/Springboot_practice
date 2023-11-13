package com.example.Securitytesting.controllers;

import com.example.Securitytesting.models.User;
import com.example.Securitytesting.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    // all users
    public List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }

    @GetMapping("/{username}")
    // single user
    public User getUser(@PathVariable("username") String username){
        return this.userService.getUser(username);
    }

    @PostMapping("/")
    // adding user
    public User add(@RequestBody User user){
        return this.userService.addUser(user);
    }
}
