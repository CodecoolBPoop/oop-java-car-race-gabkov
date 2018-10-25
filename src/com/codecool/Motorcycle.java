package com.codecool;


public class Motorcycle extends Vehicle {
    private static int nameNumber = 1;
    private String name;
    private int speed;

    int getSpeed(){
        return speed;
    }

    String getName(){
        return name;
    }

    Motorcycle(){
        name = "Motorcycle " + nameNumber;
        nameNumber++;
        speed = 100;

    }
}
