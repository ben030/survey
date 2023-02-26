package com.example.surveywebapi;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    static final String topicExchangeName = "vote-exchange";

    private RabbitTemplate rabbitTemplate;

    public MessageSender(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void send(int message) {
        rabbitTemplate.convertAndSend(topicExchangeName, "votes.programming", message);
    }
}
