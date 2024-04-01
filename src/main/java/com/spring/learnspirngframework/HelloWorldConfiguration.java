package com.spring.learnspirngframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address address) {
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
        return new Person("byun", 20, new Address("평택시", "경기도"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) { // address가 address2, address3처럼 bean 이름에 따라 결정된다.
        return new Person(name, age, address3);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address) { // address가 address2, address3처럼 bean 이름에 따라 결정된다.
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) { // address가 address2, address3처럼 bean 이름에 따라 결정된다.
        return new Person(name, age, address);
    }

    @Bean(name = "address2") // 해당 형식처럼 bean 이름을 직접 지정할 수 있다.
    @Primary // 해당 데코레이션으로 기본임을 명시해줄 수 있다.
    public Address address() {
        return new Address("가산동", "서울특별시");
    }

    @Bean(name = "address3") // 해당 형식처럼 bean 이름을 직접 지정할 수 있다.
    @Qualifier("address3qualifier") // 해당 데코레이션으로 한정자를 만들 수 있다.
    public Address address3() {
        return new Address("안성시", "경기도");
    }
}
