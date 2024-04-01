package com.spring.learnspirngframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age) {
}

record Address(String firstLine, String city) {
}


@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Min";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person("byun", 20);
    }

    @Bean
    public Address address() {
        return new Address("가산동", "서울특별시");
    }
}
