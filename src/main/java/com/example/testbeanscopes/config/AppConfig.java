package com.example.testbeanscopes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.atomic.AtomicInteger;

@Configuration
public class AppConfig {

    @Bean
    public AtomicInteger createCounter(){
        return new AtomicInteger();
    }

    @Bean
    public String createCustomString(){
        return "Test Recep";
    }

    @Bean
    public String createAnotherCustomString(){
        return "Test Recep 2";
    }
}
