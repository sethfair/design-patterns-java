package com.sethfair.patterns.observer;

public class Speedomiter implements Observer{
    @Override
    public void update(double gas, double speed, double tank_size, String direction) {
        System.out.printf("Speed: %f%n", speed);
        if (speed >= 50.0) {
            System.out.println("You are going a little fast!");
        }
    }
}
