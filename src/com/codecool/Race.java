package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Race {

    private Random rand = new Random();

    private List<Car> cars = new ArrayList<>();
    private List<Motorcycle> motorcycles = new ArrayList<>();
    private List<Truck> trucks = new ArrayList<>();

    private int brokenTruckSpeedLimit = 75;

    private void createVehicles(){
        for (int i = 0; i < 10; i++) {
            cars.add(new Car());
            motorcycles.add(new Motorcycle());
            trucks.add(new Truck());
        }
    }

    private void simulateRace(){
        for (int i = 0; i < 10; i++) {
            Car car = cars.get(i);
            Motorcycle motor = motorcycles.get(i);
            Truck truck = trucks.get(i);
            for (int j = 0; j < 50; j++) {
                    Weather.setRaining();
                    if(Weather.isRaining() && isThereABrokenTruck(truck)){
                        car.moveForAnHour(brokenTruckSpeedLimit);
                        motor.moveForAnHour(brokenTruckSpeedLimit - (rand.nextInt(5) + 51));
                    }else if(Weather.isRaining()) {
                        car.moveForAnHour(car.getSpeed());
                        motor.moveForAnHour(100 - (rand.nextInt(5) + 51));
                        truck.moveForAnHour(truck.getSpeed());
                    }else if (isThereABrokenTruck(truck)){
                        car.moveForAnHour(brokenTruckSpeedLimit);
                        motor.moveForAnHour(brokenTruckSpeedLimit );
                    } else {
                        car.moveForAnHour(car.getSpeed());
                        motor.moveForAnHour(motor.getSpeed());
                        truck.moveForAnHour(truck.getSpeed());
                    }
                }
        }
    }


    private void printRaceResults(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Race: " + (i+1));
            System.out.println(cars.get(i).getName() + " " + cars.get(i).getDistanceTraveled() + " " + Car.class.getSimpleName());
            System.out.println(motorcycles.get(i).getName() + " " + motorcycles.get(i).getDistanceTraveled() + " " + Motorcycle.class.getSimpleName());
            System.out.println(trucks.get(i).getName() + " " + trucks.get(i).getDistanceTraveled() + " " + Truck.class.getSimpleName());
            System.out.println();
        }
    }

    private boolean isThereABrokenTruck(Truck truck){
        truckBreakDowner(truck);
        if (truck.getBreakDownTurnsLeft() > 0){
            truck.decrementBreakDownTurnsLeft();
            return true;
        } else {
            return false;
        }
    }

    private void truckBreakDowner(Truck truck){
        int chanceToBreakDown = rand.nextInt(101) + 1;
        if (chanceToBreakDown <= 5 && truck.getBreakDownTurnsLeft() == 0){
            truck.setBreakDownTurnsLeft();
        }
    }

    public static void main(String[] args) {
	    Race race = new Race();
	    race.createVehicles();
	    race.simulateRace();
	    race.printRaceResults();
    }
}
