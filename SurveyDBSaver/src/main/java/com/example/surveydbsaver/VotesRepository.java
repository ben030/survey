package com.example.surveydbsaver;

import com.example.surveydbsaver.Entity.Vote;
import org.springframework.data.repository.CrudRepository;

public interface VotesRepository extends CrudRepository<Vote, Long> {
    Vote findById(long id);
}
