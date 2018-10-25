package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Race {

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

    public void simulateRace(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) {
                Weather.setRaining();
                cars.get(i).moveForAnHour(cars.get(i).getSpeed());
                motorcycles.get(i).moveForAnHour(motorcycles.get(i).getSpeed());
                trucks.get(i).moveForAnHour(trucks.get(i).getSpeed());
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
    } // prints each vehicle's name, distance traveled ant type.


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
