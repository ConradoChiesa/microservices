package com.konrad.testconnectmysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.konrad.testconnectmysql.entitie.User;
import com.konrad.testconnectmysql.repository.UserRepository;

@RestController
@RequestMapping(path="/demo")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String name,
                                            @RequestParam String lastName,
                                            @RequestParam String email) {

        User n = new User();
        n.setFirstName(name);
        n.setLastName(lastName);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() { return userRepository.findAll(); }
}