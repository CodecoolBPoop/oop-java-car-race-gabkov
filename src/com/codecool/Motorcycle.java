package com.codecool;


public class Motorcycle extends Vehicle {

    private static int nameNumber = 1;

    Motorcycle(){
        name = "Motorcycle " + nameNumber;
        nameNumber++;
        speed = 100;

    }
}
