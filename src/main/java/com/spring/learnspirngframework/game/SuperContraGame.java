package com.spring.learnspirngframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier") // Qualifier 데코레이션을 이용하면 특정 컴포넌트를 지정해서 사용할 수 있다.
public class SuperContraGame implements GamingConsole {
    public void up() {
        System.out.println("Jump!");
    }

    public void down() {
        System.out.println("Sit down!");
    }

    public void left() {
        System.out.println("Go back!");
    }

    public void right() {
        System.out.println("Shoot a bullet!");
    }
}
