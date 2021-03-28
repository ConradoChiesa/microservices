package com.konrad.testconnectmysql.controller;

import com.konrad.testconnectmysql.entitie.Message;
import com.konrad.testconnectmysql.controller.response.MessageResponse;
import com.konrad.testconnectmysql.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping(path = "/message")
    public MessageResponse addNewMessage(@Valid @RequestBody Message message) {
        Message messageResponse = messageService.addNewMessage(message);
        return new MessageResponse(messageResponse);
    }

    @GetMapping(path="/messages")
    public Iterable<Message> getAllMessage() { return messageService.getAllMessages(); }

    @GetMapping(path="/message")
    @ResponseBody
    public MessageResponse getMessageById(@RequestParam Integer id) {
        System.out.println(id);
        try {
            return (MessageResponse)messageService.getMessageById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
