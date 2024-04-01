package com.spring.learnspirngframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
//        getBean("name") 이런 식으로 메소드 이름을 지정해서 가져올 수 있다.
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("address2"));
//        System.out.println(context.getBean(Address.class)); // 해당 형식처럼 bean을 검색하고 사용할 수 있다.
    }
}
