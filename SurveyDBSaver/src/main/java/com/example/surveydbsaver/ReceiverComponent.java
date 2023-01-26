package com.example.surveydbsaver;

import com.example.surveydbsaver.Entity.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReceiverComponent {

    @Autowired
    VotesRepository votesRepository;
    public void receiveMessage(int message) {
        System.out.println("Received vote <" + message + ">");
        Vote v = votesRepository.findById(message);
        v.setCounter(v.getCounter() + 1);
        System.out.println("Vote after update: " + v.toString() );
        votesRepository.save(v);
    }
}