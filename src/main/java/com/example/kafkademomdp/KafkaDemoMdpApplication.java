package com.example.kafkademomdp;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaDemoMdpApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaDemoMdpApplication.class, args);
    }


    @Bean
    public ApplicationRunner runner(Producer p) {
        return args -> {
            Thread.sleep(5000);
            p.sendMessage("Hello Kafka");
        };
    }
}
