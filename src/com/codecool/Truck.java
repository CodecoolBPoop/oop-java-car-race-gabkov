package com.codecool;


public class Truck extends Vehicle {

    private int breakDownTurnsLeft;


    int getBreakDownTurnsLeft(){
        return breakDownTurnsLeft;
    }

    void decrementBreakDownTurnsLeft(){
        breakDownTurnsLeft--;
    }

    void setBreakDownTurnsLeft() { breakDownTurnsLeft = 2; }

    Truck(){
        this.name = String.valueOf(rand.nextInt(1001));
        int chanceToBreakDown = rand.nextInt(101) + 1;
        if (chanceToBreakDown <= 5 && breakDownTurnsLeft == 0){
            breakDownTurnsLeft = 2;
        }
        speed = 100;
    }
}
