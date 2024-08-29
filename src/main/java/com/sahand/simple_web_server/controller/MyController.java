package com.sahand.simple_web_server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

    Logger logger = LoggerFactory.getLogger(MyController.class);

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {

        logger.info("Hello World API triggered!");
        return ResponseEntity.ok("Hello World!");
    }

}
