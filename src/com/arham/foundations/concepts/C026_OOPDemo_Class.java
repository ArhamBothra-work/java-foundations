package com.arham.foundations.concepts;

public class C026_OOPDemo_Class {

    // Car class

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 50000.99;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }

    void drive(){
        System.out.println("YOu drive the "+ model);
    }

    void brake(){
        System.out.println("You brake the "+model);
    }
}
