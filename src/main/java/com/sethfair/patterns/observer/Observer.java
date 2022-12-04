package com.sethfair.patterns.observer;

public interface Observer {
    public void update(double gas, double speed, double tank_size, String direction);
}
