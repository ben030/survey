package com.example.surveydbsaver;

import com.example.surveydbsaver.Entity.Vote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

// Receives RabbitMQ messages and writes result in DB
@Component
public class ReceiverComponent {

    Logger logger = LoggerFactory.getLogger(ReceiverComponent.class);

    VotesRepository votesRepository;
    ReceiverComponent(VotesRepository votesRepository) {
        this.votesRepository = votesRepository;
    }

    public void receiveMessage(int message) {
        logger.info("Received vote <" + message + ">");
        Vote v = votesRepository.findById(message);
        v.setCounter(v.getCounter() + 1);
        logger.info("Vote after update: " + v.toString());
        votesRepository.save(v);
    }
}