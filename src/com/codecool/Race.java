package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Race {

    private Random rand = new Random();

    List<Car> cars = new ArrayList<>();
    List<Motorcycle> motorcycles = new ArrayList<>();
    List<Truck> trucks = new ArrayList<>();

    private void createVehicles(){
        for (int i = 0; i < 10; i++) {
            cars.add(new Car());
            motorcycles.add(new Motorcycle());
            trucks.add(new Truck());
        }
    }

    private void simulateRace(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) {
                Weather.setRaining();
                if(Weather.isRaining()){
                    cars.get(i).moveForAnHour(cars.get(i).getSpeed());
                    motorcycles.get(i).moveForAnHour(100 - (rand.nextInt(5) + 51));
                    trucks.get(i).moveForAnHour(trucks.get(i).getSpeed());
                } else {
                    cars.get(i).moveForAnHour(cars.get(i).getSpeed());
                    motorcycles.get(i).moveForAnHour(motorcycles.get(i).getSpeed());
                    trucks.get(i).moveForAnHour(trucks.get(i).getSpeed());
                }
            }
        }
    } // simulates the race by
    // - calling moveForAnHour() on every vehicle 50 times
    // - setting whether its raining


    private void printRaceResults(){
        for (int i = 0; i < 10; i++) {
            System.out.println(cars.get(i).getName() + " " + cars.get(i).getDistanceTraveled() + " " + Car.class.getSimpleName());
            System.out.println(motorcycles.get(i).getName() + " " + motorcycles.get(i).getDistanceTraveled() + " " + Motorcycle.class.getSimpleName());
            System.out.println(trucks.get(i).getNameNumber() + " " + trucks.get(i).getDistanceTraveled() + " " + Truck.class.getSimpleName());
        }
    }

    boolean isThereABrokenTruck(){
        return true;
    }


    public static void main(String[] args) {
	    Race race = new Race();
	    race.createVehicles();
	    race.simulateRace();
	    race.printRaceResults();
    }
}
