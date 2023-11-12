package com.atradius;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
public class ProductEventPublisherTests {

    @Autowired
    private ProductEventPublisher productEventPublisher;

    @Test
    void shouldPublishEvent() {

        //Given
        var product = new Product(
            1L, 
            "ABC",
            "My Product",
            "My Product description",
            new BigDecimal("1.0")
            );

        //When
        productEventPublisher.publishProductCreatedEvent(product);

        //Test
    }

}
