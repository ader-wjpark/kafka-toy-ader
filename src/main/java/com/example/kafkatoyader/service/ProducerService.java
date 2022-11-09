package com.example.kafkatoyader.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProducerService {

    private static final String TOPIC = "cellook-ader";
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(String message) {
        log.info("Producer message : {}", message);

        this.kafkaTemplate.send(TOPIC, message);
    }


}
