package com.spring.learnspirngframework.examples.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Named // 해당 어노테이션은 @Component 어노테이션을 대체할 수 있다.
class BusinessService {
    private DataService dataService;

    //    @Autowired
    @Inject // 해당 어노테이션은 @Autowired 어노테이션을 대체할 수 있다.
    public BusinessService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }
}

//@Component
@Named // 해당 어노테이션은 @Component 어노테이션을 대체할 수 있다.
class DataService {
}

@Configuration
@ComponentScan()
public class CdiContextLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class);) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
