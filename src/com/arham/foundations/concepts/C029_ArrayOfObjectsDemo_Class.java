package com.arham.foundations.concepts;

public class C029_ArrayOfObjectsDemo_Class {
    String model;
    String color;

    C029_ArrayOfObjectsDemo_Class(String model,String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the "+ this.color + " " + this.model);
    }

}
