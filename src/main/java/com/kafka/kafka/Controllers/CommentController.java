package com.kafka.kafka.Controllers;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    private KafkaTemplate<String, String> kafkaTemplate;

    public CommentController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @RequestMapping("/api/comment")
    @PostMapping
    public void updateArticle(){
        kafkaTemplate.send("commentT", "commentT created");
        kafkaTemplate.send("commentT", "comment updated ");

    }
}

