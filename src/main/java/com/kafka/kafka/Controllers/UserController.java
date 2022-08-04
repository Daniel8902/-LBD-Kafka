package com.kafka.kafka.Controllers;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private KafkaTemplate<String, String> kafkaTemplate;

    public UserController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @RequestMapping("/api/user")
    @PostMapping
    public void upadateUser(){
        kafkaTemplate.send("userT","Created new User");

    }

}
