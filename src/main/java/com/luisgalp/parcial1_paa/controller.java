package com.luisgalp.parcial1_paa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class controller 
{
    
    @Autowired
    private MessageRepository messageRepository;

    @PostMapping
    public Message saveMessage(@RequestBody String content) {
        Message message = new Message();
        message.setContent(content);
        return messageRepository.save(message);
    }

    @GetMapping("/latest")
    public Message getLatestMessage() {
        return messageRepository.findTopByOrderByIdDesc().orElse(null);
    }
}