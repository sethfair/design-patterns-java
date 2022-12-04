package com.sethfair.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Car implements Subject{

    private final List<Observer> observerList;
    private final double tank_size;
    private double current_speed;
    private double current_gas;

    private Direction current_direction;

    public enum Direction {
        North,
        East,
        South,
        West
    }

    public Car(double tankSize, Direction current_direction, double speed) {
        this.observerList = new ArrayList<>();
        this.tank_size = tankSize;
        updateSpeed(current_speed);
        updateDirection(current_direction);
        fillGas(tankSize);
    }

    public void drive(double speed) {
        if (current_gas > 0) {
            updateSpeed(speed);
            current_gas -= 1.0;
        } else {
            updateSpeed(0.0);
            System.out.println("no gas left");
        }
        notifyObservers();
    }
    public void updateDirection(Direction direction) {
        current_direction = direction;
        notifyObservers();
    }

    public void updateSpeed(double speed) {
        current_speed = speed;
        notifyObservers();
    }
    public void fillGas(double amount) {
        System.out.println("Filled gas up!");
        current_gas += amount;
        notifyObservers();
    }

    public void turnLeft() {
        switch (current_direction) {
            case North -> updateDirection(Direction.West);
            case East -> updateDirection(Direction.North);
            case South -> updateDirection(Direction.East);
            case West -> updateDirection(Direction.South);
        }
        notifyObservers();
    }

    public void turnRight() {
        switch (current_direction) {
            case North -> updateDirection(Direction.East);
            case East -> updateDirection(Direction.South);
            case South -> updateDirection(Direction.West);
            case West -> updateDirection(Direction.North);
        }
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observerList) {
            o.update(current_gas, current_speed, tank_size, current_direction.toString());
        }
    }
}
