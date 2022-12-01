package com.sethfair.patterns.command;

public class Character {
    int x = 0;
    int y = 0;
    int speed = 1;
    public void run() {
        System.out.println("Character is running...");
    }
    public void jump() {
        System.out.println("Character is jumping...");
    }
}
