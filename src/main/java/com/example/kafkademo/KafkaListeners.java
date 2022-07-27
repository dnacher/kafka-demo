package com.example.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Daniel Nacher
 * 2022-07-23
 */

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "kafkaTopic",
            groupId = "kafkaGroupId"
    )
    void listener(String data) {
        System.out.println("Listener recieved: " + data);
    }
}
