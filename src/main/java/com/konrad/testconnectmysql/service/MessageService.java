package com.konrad.testconnectmysql.service;

import com.konrad.testconnectmysql.response.MessageResponse;
import com.konrad.testconnectmysql.entitie.Message;
import com.konrad.testconnectmysql.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Message addNewMessage (Message message) {
        Message m = new Message();
        m.setTitle(message.getTitle());
        m.setBody(message.getBody());
        return messageRepository.save(m);
    }

    public Iterable<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    public MessageResponse getMessageById(Integer id) {
        MessageResponse mr = new MessageResponse();
        Optional<Message> o = messageRepository.findById(id);
        if (o.isPresent()) {
            mr.setTitle(o.get().getTitle());
            mr.setMessage(o.get().getBody());
        }
        return mr;
    }
}
