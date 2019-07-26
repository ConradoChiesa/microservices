package com.konrad.testconnectmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Message addNewMessage (@RequestParam String title
            , @RequestParam String body) {
        Message m = new Message();
        m.setTitle(title);
        m.setBody(body);
        messageRepository.save(m);
        return messageRepository.addNewMessage(title, body);
    }

    public @ResponseBody Iterable<Message> getAllMessages() {
        return messageRepository.findAll();
    }
}
