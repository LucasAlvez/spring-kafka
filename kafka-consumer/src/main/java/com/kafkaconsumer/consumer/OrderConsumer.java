package com.kafkaconsumer.consumer;

import com.kafkaconsumer.model.Order;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class OrderConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic}", groupId = "${spring.kafka.group-id}")
    public void receive(@Payload Order data,
                        @Headers MessageHeaders headers) {

        LOGGER.info("Received data='{}'", data);
        headers.keySet().forEach(key -> {
            LOGGER.info("{}: {}", key, headers.get(key));
        });
    }
}
