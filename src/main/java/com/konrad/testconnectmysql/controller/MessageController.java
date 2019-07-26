package com.konrad.testconnectmysql.controller;

import com.konrad.testconnectmysql.entitie.Message;
import com.konrad.testconnectmysql.controller.response.MessageResponse;
import com.konrad.testconnectmysql.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping(path = "/send")
    public MessageResponse addNewMessage(
            @RequestParam String title,
            @RequestParam String body) {
        Message message = messageService.addNewMessage(title, body);
        return new MessageResponse(message);
    }
//
//    @GetMapping(path = "/all")
//    public MessageResponse getMessages(@RequestParam Integer id) {
//
//        return new MessageResponse(messages);
//    }

}
