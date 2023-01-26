package com.example.surveydbsaver;

import java.util.concurrent.atomic.AtomicLong;

import com.example.surveydbsaver.Entity.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private VotesRepository votesRepository;

    @GetMapping("/")
    public ResponseEntity<Iterable<Vote>> greeting() {
        return ResponseEntity.ok(votesRepository.findAll());
    }
}