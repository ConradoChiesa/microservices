package com.konrad.testconnectmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/message")
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping(path = "/send")
    public MessageResponse addNewMessage(
            @RequestParam String title,
            @RequestParam String body) {
        Message message = MessageService.addNewMessage(title, body);
        return new MessageResponse(message);
    }

    @GetMapping(path = "/all")
    public MessageService

}
