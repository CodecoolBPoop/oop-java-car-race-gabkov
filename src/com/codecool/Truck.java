package com.codecool;


public class Truck extends Vehicle {

    private int breakDownTurnsLeft;


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
        this.name = String.valueOf(rand.nextInt(1001));
        int chanceToBreakDown = rand.nextInt(101) + 1;
        if (chanceToBreakDown <= 5 && breakDownTurnsLeft == 0){
            speed = 0;
            breakDownTurnsLeft = 2;
        } else {
            speed = 100;
        }
    }
}
