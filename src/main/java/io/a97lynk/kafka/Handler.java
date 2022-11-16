package io.a97lynk.kafka;

import io.a97lynk.kafka.dto.Role;
import io.a97lynk.kafka.dto.User;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@KafkaListener(id = "abc-service", topics = "chat")
public class Handler {

    @KafkaHandler
    public void listening(Role role) {
        System.out.println("listening role " + role);
    }

    @KafkaHandler
    public void listening(User user) {
        System.out.println("listening user " + user);
    }
}
