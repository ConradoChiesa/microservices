package com.konrad.testconnectmysql;
import org.springframework.data.repository.CrudRepository;

import com.konrad.testconnectmysql.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}