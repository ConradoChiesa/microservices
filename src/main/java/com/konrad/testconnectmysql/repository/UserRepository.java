package com.konrad.testconnectmysql.repository;
import org.springframework.data.repository.CrudRepository;

import com.konrad.testconnectmysql.entitie.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}