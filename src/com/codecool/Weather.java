package com.codecool;

import java.util.Random;


public class Weather {

    private static boolean isRaining;

    static void setRaining() {
        Random rand = new Random();
        int rainingChance = rand.nextInt(10) + 1;
        if (rainingChance <= 3) {
            isRaining = true;
        } else {
            isRaining = false;
        }
    }

    static boolean isRaining(){
        return isRaining;
    }
}
