package com.arham.foundations.concepts;

public class C033_MethodOverridingDemo {
    public static void main(String[] args) {
        C033_Dog dog = new C033_Dog();
        C033_Cat cat = new C033_Cat();
        C033_Fish fish = new C033_Fish();

        dog.move();
        cat.move();
        fish.move();
    }

}

class C033_Animal{
    void move(){
        System.out.println("This animal is running");
    }
}

class C033_Dog extends C033_Animal{

}

class C033_Cat extends C033_Animal{

}

class C033_Fish extends C033_Animal{

    @Override
    void move(){
        System.out.println("This animal is swimming");
    }

}