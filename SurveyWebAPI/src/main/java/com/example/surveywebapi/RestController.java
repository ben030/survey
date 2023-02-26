package com.example.surveywebapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    Logger logger = LoggerFactory.getLogger(RestController.class);
    @Autowired
    private MessageSender messageSender;

    @PostMapping("/vote")
    @ResponseBody
    public void addVote(@RequestParam(value = "id") Integer id ) {
        logger.info("received id: " + id);
        if (id >= 1 && id <= 3) {
            messageSender.send(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}