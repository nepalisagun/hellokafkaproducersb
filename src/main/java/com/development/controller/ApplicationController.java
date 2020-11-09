package com.development.controller;

import com.development.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka-application")
public class ApplicationController {

    @Autowired
    ApplicationService service;

    public String producer(@RequestParam("message") String message) {
        service.send(message);

        return "Message sent to the Kafka topic Successfully";
    }

}
