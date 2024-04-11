package com.financeservice;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaReadTest {

    @KafkaListener(topics = "${spring.kafka.read-topic.name}",
            groupId = "${spring.kafka.consumer.group-id}")
    public void getMessage(String str) {
        System.out.println(str);
    }
}



