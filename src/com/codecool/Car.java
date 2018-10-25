package com.codecool;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Car extends Vehicle {
    private int speed;
    private String name;

    private List<String> possibleNames = Arrays.asList("Mirage", "Rune", "Serpent", "Enigma", "Aura", "Wolf", "Orbit", "Aura", "Cosmos", "Legend");

    private Random rand = new Random();

    int getSpeed(){
       return speed;
    }

    String getName(){
        return name;
    }

    Car(){
        speed = rand.nextInt(80) + 31;
        int firstName = rand.nextInt(10);
        int lastName = rand.nextInt(10);
        name = possibleNames.get(firstName) + possibleNames.get(lastName);
    }


}
