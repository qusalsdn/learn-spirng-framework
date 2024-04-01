package com.spring.learnspirngframework;

import com.spring.learnspirngframework.game.GameRunner;
import com.spring.learnspirngframework.game.GamingConsole;
import com.spring.learnspirngframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
