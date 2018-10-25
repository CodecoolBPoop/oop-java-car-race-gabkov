package com.codecool;

import java.util.Random;


public abstract class Vehicle {

    private int distanceTraveled;
    int speed;
    String name;

    Random rand = new Random();

    int getDistanceTraveled(){
        return distanceTraveled;
    }

    int getSpeed(){
        return speed;
    }

    String getName(){
        return name;
    }

    void moveForAnHour(int kmh){
        distanceTraveled += kmh;
    }
}
