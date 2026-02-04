package com.arham.foundations.concepts;

public class C034_ToStringMethodDemo {
    public static void main(String[] args) {
        Cars car = new Cars("Ford","Mustang",2025,"Red");
        System.out.println(car);
    }
}

class Cars{

    String make;
    String model;
    int year;
    String color;

    Cars(  String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}