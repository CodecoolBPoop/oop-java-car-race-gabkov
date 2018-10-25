package com.codecool;

import java.util.Random;

public class Truck extends Vehicle {
    private int speed = 100;
    private int breakDownTurnsLeft;
    private int nameNumber;

    private Random rand = new Random();

    public int getSpeed(){
        return speed;
    }

    public int getNameNumber(){
        return nameNumber;
    }

    public int getBreakDownTurnsLeft(){
        return breakDownTurnsLeft;
    }


    Truck(){
        this.nameNumber = rand.nextInt(1001);
        int chanceToBreakDown = rand.nextInt(101) + 1;
        if (chanceToBreakDown <= 5 && breakDownTurnsLeft == 0){
            speed = 0;
            breakDownTurnsLeft = 2;
        } else if (breakDownTurnsLeft > 0) {
            breakDownTurnsLeft -= 1;
        } else {
            speed = 100;
        }
    }
}
