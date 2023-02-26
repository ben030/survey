package com.example.surveydbsaver;

import com.example.surveydbsaver.Entity.Vote;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private VotesRepository votesRepository;

    RestController(VotesRepository votesRepository) {
        this.votesRepository = votesRepository;
    }

    @GetMapping("/")
    public ResponseEntity<Iterable<Vote>> allVotes() {
        return ResponseEntity.ok(votesRepository.findAll());
    }
}