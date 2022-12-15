package st.project.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import st.project.demo.entites.Message;
import st.project.demo.services.MessageServiceImpl;

@RestController
@RequestMapping("/api/v1/message")
public class MessageController {
    @Autowired
    private MessageServiceImpl messageService;

    @GetMapping("/api/v1/message/get/{id}")
    public Message getMessage(@PathVariable Long id){return messageService.getMessageById(id);}
}
