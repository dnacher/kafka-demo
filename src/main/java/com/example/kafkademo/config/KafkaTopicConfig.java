package com.example.kafkademo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * Daniel Nacher
 * 2022-07-23
 */

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic kafkaTopic(){
        return TopicBuilder.name("kafkaTopic")
                .build();
    }
}
