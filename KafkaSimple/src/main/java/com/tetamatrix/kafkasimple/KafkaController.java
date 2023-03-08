package com.tetamatrix.kafkasimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/1.0")
public class KafkaController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public void sendMessage(@RequestParam String message) {
        kafkaTemplate.send("baeldung", message);
    }
}
