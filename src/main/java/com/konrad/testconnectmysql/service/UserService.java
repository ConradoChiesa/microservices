package com.konrad.testconnectmysql.service;

import com.konrad.testconnectmysql.entitie.User;
import com.konrad.testconnectmysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getById(Integer id){
        return userRepository.findById(id);
    }

    public void addNewUser(User user) {
        userRepository.save(user);
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }
}
