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

    public User getById(Integer id){
        User user = new User();
        Optional<User> u = userRepository.findById(id);
        if (u.isPresent()) { // Optional aprender a usar bien
          //  user.s
        }
        /*
                MessageResponse mr = new MessageResponse();
            mr.setTitle(o.get().getTitle());
            mr.setMessage(o.get().getBody());
        }
        return mr;
         */
        return user;
        //return userRepository.findById(id);
    }

    public void addNewUser(User user) {
        userRepository.save(user);
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }
}
