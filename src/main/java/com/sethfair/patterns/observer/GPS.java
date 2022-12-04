package com.sethfair.patterns.observer;

public class GPS implements Observer {
    @Override
    public void update(double gas, double speed, double tank_size, String direction) {
        System.out.printf("Direction: %s%n", direction);
    }
}
