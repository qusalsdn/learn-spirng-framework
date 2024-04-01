package com.spring.learnspirngframework.game;

import com.spring.learnspirngframework.game.GameRunner;
import com.spring.learnspirngframework.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
