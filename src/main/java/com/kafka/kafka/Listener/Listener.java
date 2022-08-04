package com.kafka.kafka.Listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(
            topics="userT",
            groupId = "groupId"
    )
    void userListener(String data){
        System.out.println("User listener : " + data);
    }

    @KafkaListener(
            topics = "commentT",
            groupId = "groupID"
    )
    void commentListener(String data){
        System.out.println("comment listener : "+data);
    }

    @KafkaListener(
            topics = "articleT",
            groupId = "groupId"
    )
    void articleListener(String data){
        System.out.println("Article listener : "+data);
    }
}
