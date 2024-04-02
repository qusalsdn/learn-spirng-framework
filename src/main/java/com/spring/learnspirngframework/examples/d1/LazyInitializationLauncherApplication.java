package com.spring.learnspirngframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {
    public ClassA() {
    }
}

@Component
@Lazy // 기본적으로는 Bean은 즉시 초기화되지만 해당 어노테이션을 이용하면 해당 클레스 Bean을 사용할 때만 초기화된다.
class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Some Initialization logic");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Do Something!");
    }
}

@Configuration
@ComponentScan()
public class LazyInitializationLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class);) {
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("Initialization of context is completed!");
            context.getBean(ClassB.class).doSomething();
        }
    }
}
