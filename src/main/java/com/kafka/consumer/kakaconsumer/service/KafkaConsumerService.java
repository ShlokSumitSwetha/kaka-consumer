package com.kafka.consumer.kakaconsumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "users", groupId = "consumer-group-2")
    public void Invoice1Consumer(@Payload String value,
                                 @Header(name = KafkaHeaders.RECEIVED_KEY) String key) {
        log.info(String.format("Received Message Key: %s, Value: %s", key, value));
    }
}
