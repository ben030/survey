package com.example.surveydbsaver;

import com.example.surveydbsaver.Entity.Vote;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VotesRepository extends CrudRepository<Vote, Long> {
    Vote findById(long id);
}
