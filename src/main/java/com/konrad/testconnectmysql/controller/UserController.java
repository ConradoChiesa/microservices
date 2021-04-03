package com.konrad.testconnectmysql.controller;

import com.konrad.testconnectmysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.konrad.testconnectmysql.entitie.User;

import javax.validation.Valid;

@RestController
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path="/add")
    public void addNewUser (@Valid @RequestBody User user) {
        userService.addNewUser(user);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() { return userService.findAll(); }

    @GetMapping("/getUserByID")
    public User getUserById(@RequestParam Integer id){
        return userService.getById(id);

    }
}