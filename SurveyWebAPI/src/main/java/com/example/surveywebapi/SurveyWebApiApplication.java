package com.example.surveywebapi;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SurveyWebApiApplication {

    public static final String topicExchangeName = "spring-boot-exchange";

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SurveyWebApiApplication.class, args);
    }
}