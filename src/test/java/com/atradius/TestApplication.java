package com.atradius;

import org.springframework.boot.SpringApplication;

public class TestApplication {
    public static void main(String[] args) {
        SpringApplication
                .from(MainApplication::main)
                .with(TestcontainersConfiguration.class)
                .run(args);
    }
}
