package com.example.surveydbsaver.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String language;
    private long counter;
    public Vote() {
    }
    public Vote(String language, long counter) {
        this.language = language;
        this.counter = counter;
    }
    public long getId() {
        return id;
    }

    public String getLanguage() {
        return language;
    }

    public long getCounter() {
        return counter;
    }
    public void setCounter(long value) {
        this.counter = value;
    }
    @Override
    public String toString() {
        return "Counter{" +
                "id=" + id +
                ", name='" + language + '\'' +
                ", value=" + counter +
                '}';
    }
}