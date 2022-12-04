package com.sethfair.patterns.observer;

public class GasGauge implements Observer {

    @Override
    public void update(double gas, double speed, double tank_size, String direction) {
        System.out.printf("Gas: %f/%f gallons%n", gas, tank_size);
        if (gas <= tank_size*0.2) {
            System.out.println("WARNING: Low on gas!");
        }

        if (gas == 0.0) {
            System.out.println("WARNING: No gas left!");
        }
    }
}
