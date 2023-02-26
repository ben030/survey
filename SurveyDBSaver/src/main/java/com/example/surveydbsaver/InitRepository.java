package com.example.surveydbsaver;

import com.example.surveydbsaver.Entity.Vote;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class InitRepository implements CommandLineRunner {

    VotesRepository votesRepository;

    InitRepository(VotesRepository votesRepository) {
        Objects.requireNonNull(votesRepository);
        this.votesRepository = votesRepository;
    }

    @Override
    public void run(String... args) {
        Vote v1 = new Vote("Java", 5);
        Vote v2 = new Vote("Kotlin", 3);
        Vote v3 = new Vote("VBA", 0);
        votesRepository.save(v1);
        votesRepository.save(v2);
        votesRepository.save(v3);
    }
}
