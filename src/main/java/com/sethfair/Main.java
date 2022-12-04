package com.sethfair;

import com.sethfair.patterns.command.Game;
import com.sethfair.patterns.command.GameController;
import com.sethfair.patterns.observer.Car;
import com.sethfair.patterns.observer.GPS;
import com.sethfair.patterns.observer.GasGauge;
import com.sethfair.patterns.observer.Speedomiter;

class Main {
    public static void main(String[]args){
        //commandPattern();
        observer();
    }

    private static void observer() {
        Car car = new Car(6.0, Car.Direction.North, 0.0);
        GasGauge gasGauge = new GasGauge();
        GPS gps = new GPS();
        Speedomiter speedomiter = new Speedomiter();

        car.registerObserver(gasGauge);
        car.registerObserver(gps);
        car.registerObserver(speedomiter);

        car.drive(20.0);
        car.drive(25.0);
        car.turnLeft();
        car.drive(30.0);
        car.drive(33.0);
        car.turnRight();
        car.drive(32.0);
        car.turnRight();
        car.drive(33.0);
        car.fillGas(6.0);
        car.drive(33.0);
    }

    private static void commandPattern() {
        GameController controller = new GameController();
        Game game = new Game(controller);

        controller.handleDKey();
        controller.handleWKey();
    }
}