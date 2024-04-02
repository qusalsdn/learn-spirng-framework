package com.spring.learnspirngframework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass {
}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) // 프로토타입은 매번 Spring 컨텍스트에서 새로운 Bean을 가져온다. 기본은 싱글톤이다.
@Component
class prototypeClass {
}

@Configuration
@ComponentScan()
public class BeanScopesLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class);) {
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            System.out.println(context.getBean(prototypeClass.class));
            System.out.println(context.getBean(prototypeClass.class));
            System.out.println(context.getBean(prototypeClass.class));
        }
    }
}
