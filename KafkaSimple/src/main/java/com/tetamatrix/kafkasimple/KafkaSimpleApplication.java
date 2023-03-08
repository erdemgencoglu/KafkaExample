package com.tetamatrix.kafkasimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaSimpleApplication.class, args);
    }

    @KafkaListener(topics = "baeldung", groupId = "foo")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }
}
