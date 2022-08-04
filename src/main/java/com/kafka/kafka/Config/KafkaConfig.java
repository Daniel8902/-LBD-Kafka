package com.kafka.kafka.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic userT(){
        return TopicBuilder.name("userT")
                .build();
    }
    @Bean NewTopic commentT(){
        return TopicBuilder.name("commentT")
                .build();
    }
    @Bean
    NewTopic articleT(){
        return TopicBuilder.name("articleT")
                .build();
    }

}
