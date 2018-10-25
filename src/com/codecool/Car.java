package com.codecool;

import java.util.Arrays;
import java.util.List;


public class Car extends Vehicle {
    private List<String> possibleNames = Arrays.asList("Mirage", "Rune", "Serpent", "Enigma", "Aura", "Wolf", "Orbit", "Aura", "Cosmos", "Legend");

    Car(){
        speed = rand.nextInt(80) + 31;
        int firstName = rand.nextInt(10);
        int lastName = rand.nextInt(10);
        name = possibleNames.get(firstName) + possibleNames.get(lastName);
    }


}
