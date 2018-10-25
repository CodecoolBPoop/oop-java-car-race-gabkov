package com.codecool;

public abstract class Vehicle {

    private int distanceTraveled;

    public int getDistanceTraveled(){
        return distanceTraveled;
    }

    void moveForAnHour(int kmh){
        distanceTraveled += kmh;
    }
}
