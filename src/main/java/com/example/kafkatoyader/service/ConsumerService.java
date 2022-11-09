package com.example.kafkatoyader.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class ConsumerService {

    @KafkaListener(topics = "cellook-ader", groupId = "cellook")
    public void consume(String message) throws IOException {
        log.info("Consume message : {}", message);
    }

}
