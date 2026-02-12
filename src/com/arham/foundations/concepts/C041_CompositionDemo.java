package com.arham.foundations.concepts;

public class C041_CompositionDemo {
    public static void main(String[] args) {

        C041_Car car = new C041_Car("Corvette", 2025, "V8");
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}

class C041_Car{

    String model;
    int year;
    Engine engine;

    C041_Car(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("The "+ this.model + " is running");
    }
}

class Engine{
    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println("You start the "+ this.type + " Engine");
    }
}