package io.a97lynk.kafka;

import io.a97lynk.kafka.dto.Role;
import io.a97lynk.kafka.dto.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.UUID;

@SpringBootApplication
@EnableScheduling
public class KafkaDemoApplication {

    public KafkaDemoApplication(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaDemoApplication.class, args);
    }

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Scheduled(cron = "*/5 * * * * *")
    public void sendMessage() {
        System.out.println("Send message");
        kafkaTemplate.send("chat", new Role(UUID.randomUUID().toString(), "User")).addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {
            @Override
            public void onFailure(Throwable ex) {
                System.out.println(ex.getMessage());
            }

            @Override
            public void onSuccess(SendResult<String, Object> result) {
                System.out.println("Sent! " + result.getProducerRecord().partition());
            }
        });

        kafkaTemplate.send("chat", new User(UUID.randomUUID(), "Administration")).addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {
            @Override
            public void onFailure(Throwable ex) {
                System.out.println(ex.getMessage());
            }

            @Override
            public void onSuccess(SendResult<String, Object> result) {
                System.out.println("Sent! " + result.getProducerRecord().partition());
            }
        });

    }

}
