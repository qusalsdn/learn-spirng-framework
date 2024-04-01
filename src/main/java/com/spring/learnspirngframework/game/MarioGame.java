package com.spring.learnspirngframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // 여러 게임 중 마리오 게임을 기본으로 설정
public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("Jump!");
    }

    public void down() {
        System.out.println("Go into a hole!");
    }

    public void left() {
        System.out.println("Go left!");
    }

    public void right() {
        System.out.println("Accelerate!");
    }
}
