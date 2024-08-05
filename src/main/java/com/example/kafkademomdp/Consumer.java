package com.example.kafkademomdp;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics="mdpTestTopic",groupId="group5")
    public void listenMessage(String message) {
        System.out.println(message);
    }
}
