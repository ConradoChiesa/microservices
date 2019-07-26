package com.konrad.testconnectmysql.repository;

import com.konrad.testconnectmysql.entitie.Message;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface MessageRepository extends CrudRepository<Message, Integer> {

}
