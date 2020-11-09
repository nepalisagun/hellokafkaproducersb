package com.development.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    String kafkaTopic = "applicationDevTopic";

    public void send(String message) {
        kafkaTemplate.send(kafkaTopic, message);
    }

}
