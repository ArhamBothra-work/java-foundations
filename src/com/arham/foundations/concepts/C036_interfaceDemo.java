package com.arham.foundations.concepts;

public class C036_interfaceDemo {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}

interface Prey{

    void flee();
}

interface Predator {

    void hunt();
}

class Rabbit implements Prey{

    @Override
    public void flee(){
        System.out.println("The rabbit is running away");
    }
}

class Fish implements Prey,Predator{

    @Override
    public void flee(){
        System.out.println("The fish is swimming away");
    }

    @Override
    public void hunt(){
        System.out.println("The fish is hunting");
    }
}

class Hawk implements Predator{

    @Override
    public void hunt(){
        System.out.println("The hawk is hunting");
    }
}