package com.codecool;

import static com.codecool.Weather.isRaining;
import java.util.Random;

public class Motorcycle extends Vehicle {
    private static int nameNumber = 1;
    private String name;
    private int speed;

    private Random rand = new Random();

    public int getSpeed(){
        return speed;
    }

    public String getName(){
        return name;
    }

    Motorcycle(){
        name = "Motorcycle " + nameNumber;
        nameNumber++;
        if(!isRaining()){
            speed = 100;
        } else{
            speed = 100 - rand.nextInt(5) + 51;
        }
    }
}
