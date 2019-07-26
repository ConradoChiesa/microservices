package com.konrad.testconnectmysql.service;

import com.konrad.testconnectmysql.entitie.Message;
import com.konrad.testconnectmysql.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Message addNewMessage (String title, String body) {
        Message m = new Message();
        m.setTitle(title);
        m.setBody(body);
        return messageRepository.save(m);

    }

    public @ResponseBody Iterable<Message> getAllMessages() {
        return messageRepository.findAll();
    }

}
