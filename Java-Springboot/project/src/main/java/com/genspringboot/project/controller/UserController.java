package com.genspringboot.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genspringboot.project.model.User;
import com.genspringboot.project.service.UserService;

//esto nos permite hacer petciones desde cualquier parte, no solo desde nuestro servidor local
@CrossOrigin("*")
@RestController
public class UserController {
    
    private UserService UserService;

    public UserController(@Autowired UserService userService) {
        this.UserService = userService;

    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id) {
        return UserService.getUser(id);
    }

    @PostMapping("/user")
    public User newUser(@RequestBody User user) {
        return UserService.save(user);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return UserService.save(user);

    }

    @DeleteMapping("deleteUser/{id}")
    public void deleteUser(@PathVariable Integer id) {
        UserService.delete(id);
    }
}