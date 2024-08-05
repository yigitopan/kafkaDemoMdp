package com.example.kafkademomdp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    @Autowired
    KafkaTemplate<String, String> template;

    public void sendMessage(String message) {

        //we can check the callback
        template.send("mdpTestTopic", message);

    }

}
