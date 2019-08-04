package com.konrad.testconnectmysql.service;

import com.konrad.testconnectmysql.entitie.Message;
import com.konrad.testconnectmysql.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class MessageService {

    @PropertySource("classpath:resources/application.properties")

    @Autowired
    private MessageRepository messageRepository;
    @Bean
    public Message addNewMessage (String title, String body) {

        Message m = new Message();
        m.setTitle(title);
        m.setBody(str + body + end);
        return messageRepository.save(m);

    }

    public @ResponseBody Iterable<Message> getAllMessages() {
        return messageRepository.findAll();
    }

}
