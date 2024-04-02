package com.spring.learnspirngframework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready!");
    }

    @PostConstruct // 해당 어노테이션은 의존성을 연결하는 대로 초기화 논리를 실행하려는 경우 사용한다.
    public void initialize() {
        someDependency.getReady();
    }

    @PreDestroy // 해당 어노테이션은 컨테이너에서 인스턴스를 삭제하는 과정 중에 있음을 알려주는 콜백 알림 메소드이다.
    public void cleanUp() {
        System.out.println("CleanUp");
    }
}

@Component
class SomeDependency {
    public void getReady() {
        System.out.println("Some logic using SomeDependency!");
    }
}

@Configuration
@ComponentScan()
public class PrePostAnnotationsContextLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class);) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
