package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Race {

    private Random rand = new Random();

    private List<Car> cars = new ArrayList<>();
    private List<Motorcycle> motorcycles = new ArrayList<>();
    private List<Truck> trucks = new ArrayList<>();

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
                if(Weather.isRaining() && isThereABrokenTruck(trucks.get(i))){
                    cars.get(i).moveForAnHour(75);
                    motorcycles.get(i).moveForAnHour(75 - (rand.nextInt(5) + 51));
                }else if(Weather.isRaining()) {
                    cars.get(i).moveForAnHour(cars.get(i).getSpeed());
                    motorcycles.get(i).moveForAnHour(100 - (rand.nextInt(5) + 51));
                    trucks.get(i).moveForAnHour(trucks.get(i).getSpeed());
                }else if (isThereABrokenTruck(trucks.get(i))){
                    cars.get(i).moveForAnHour(75);
                    motorcycles.get(i).moveForAnHour(75 );
                } else {
                    cars.get(i).moveForAnHour(cars.get(i).getSpeed());
                    motorcycles.get(i).moveForAnHour(motorcycles.get(i).getSpeed());
                    trucks.get(i).moveForAnHour(trucks.get(i).getSpeed());
                }
            }
        }
    }


    private void printRaceResults(){
        for (int i = 0; i < 10; i++) {
            System.out.println(cars.get(i).getName() + " " + cars.get(i).getDistanceTraveled() + " " + Car.class.getSimpleName());
            System.out.println(motorcycles.get(i).getName() + " " + motorcycles.get(i).getDistanceTraveled() + " " + Motorcycle.class.getSimpleName());
            System.out.println(trucks.get(i).getNameNumber() + " " + trucks.get(i).getDistanceTraveled() + " " + Truck.class.getSimpleName());
        }
    }

    private boolean isThereABrokenTruck(Truck truck){
        if (truck.getBreakDownTurnsLeft() > 0){
            truck.decrementBreakDownTurnsLeft();
            return true;
        } else {
            truck.setSpeed();
            return false;
        }
    }


    public static void main(String[] args) {
	    Race race = new Race();
	    race.createVehicles();
	    race.simulateRace();
	    race.printRaceResults();
    }
}
