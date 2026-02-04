package com.arham.foundations.concepts;

public class C031_InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        dog.eat();
        cat.eat();
        System.out.println(dog.lives);
        System.out.println(cat.lives);
        dog.speak();
        cat.speak();
        plant.photosynthesize();

    }
}

class Organism{
    boolean isAlive;

    Organism(){
        isAlive = true;
    }
}

class Animal extends Organism{



    void eat(){
        System.out.println("The animal is eating");
    }
}

class Plant extends Organism{
    void photosynthesize(){
        System.out.println("The plant absorbs light");
    }
}

class Dog extends Animal{
    int lives = 1;

    void speak(){
        System.out.println("The dog goes *woof*");
    }
}

class Cat extends Animal{
    int lives = 9;

    void speak(){
        System.out.println("The dog goes *meow*");
    }
}

