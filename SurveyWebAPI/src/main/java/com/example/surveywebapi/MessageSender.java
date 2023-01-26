package com.example.surveywebapi;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private RabbitTemplate rabbitTemplate;

    public MessageSender(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void send(int message) {
        rabbitTemplate.convertAndSend("spring-boot-exchange", "foo.bar.baz", message);
    }
}
