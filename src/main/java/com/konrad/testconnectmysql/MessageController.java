package com.konrad.testconnectmysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/message")
public class messageController {

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping(path = "/send")
    public @ResponseBody
    String addNewMessage (@RequestParam String title
            , @RequestParam String body) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Message m = new Message();
        m.setTitle(title);
        m.setBody(body);
        messageRepository.save(m);
        return "Mensaje guardado";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Message> getAllMessages() {
        // This returns a JSON or XML with the users
        return messageRepository.findAll();
    }
}
