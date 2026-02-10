package com.arham.foundations.concepts;

public class C037_PolymorphismDemo {
    public static void main(String[] args) {
        Carss car = new Carss();
        Bikes bike = new Bikes();
        Boats boat = new Boats();

        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}

abstract class Vehicle {
    abstract void go();
}

class Carss extends Vehicle {
    @Override
    void go(){
        System.out.println("You drive the car");
    }
}

class Bikes extends Vehicle {
    @Override
    void go(){
        System.out.println("You ride the bike");
    }
}

class Boats extends Vehicle {
    @Override
    void go(){
        System.out.println("You sail the boat");
    }
}
