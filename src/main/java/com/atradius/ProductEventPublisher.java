package com.atradius;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductEventPublisher {

    private static final Logger logger = LoggerFactory.getLogger(ProductEventPublisher.class);

    @Autowired
    private KafkaTemplate<String, Product> kafkaTemplate;

    public void publishProductCreatedEvent(Product product) {
        kafkaTemplate.send("products", product);
        logger.info("ProductCreatedEvent sent to products topic");
    }
}
