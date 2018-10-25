package com.codecool;

import java.util.Random;

public class Truck extends Vehicle {
    private int speed;
    private int breakDownTurnsLeft;
    private int nameNumber;

    private Random rand = new Random();

    int getSpeed(){
        return speed;
    }

    int getNameNumber(){
        return nameNumber;
    }

    int getBreakDownTurnsLeft(){
        return breakDownTurnsLeft;
    }

    void setSpeed(){
        speed = 100;
    }

    void decrementBreakDownTurnsLeft(){
        breakDownTurnsLeft--;
    }

    Truck(){
        this.nameNumber = rand.nextInt(1001);
        int chanceToBreakDown = rand.nextInt(101) + 1;
        if (chanceToBreakDown <= 5 && breakDownTurnsLeft == 0){
            speed = 0;
            breakDownTurnsLeft = 2;
        } else {
            speed = 100;
        }
    }
}
