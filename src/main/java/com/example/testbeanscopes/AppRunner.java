package com.example.testbeanscopes;

import jakarta.annotation.Resource;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class AppRunner implements CommandLineRunner {
    private final AtomicInteger counter1;
    private final AtomicInteger counter2;
    private final String test;
    private final ApplicationContext applicationContext;

    public AppRunner(AtomicInteger counter1, AtomicInteger counter2, @Qualifier("createCustomString") String test, ApplicationContext applicationContext) {
        this.counter1 = counter1;
        this.counter2 = counter2;
        this.test = test;
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(String... args) throws Exception {
        counter1.addAndGet(2);
        counter2.addAndGet(3);
        counter1.addAndGet(5);
        System.out.println(counter1.get());
        System.out.println(counter2.get());
        System.out.println(test);
        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }
}
