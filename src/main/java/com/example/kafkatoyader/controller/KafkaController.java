package com.example.kafkatoyader.controller;

import com.example.kafkatoyader.service.ProducerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class KafkaController {

    private final ProducerService producerService;

    @PostMapping(value = "/api/kafka/produce")
    public String send(@RequestParam String message) {
        log.info("Controller Send Message : {}", message);

        producerService.send(message);
        return "SUCCESS";
    }

}
