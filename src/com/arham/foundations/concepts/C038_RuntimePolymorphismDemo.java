package com.arham.foundations.concepts;

import java.util.Scanner;

public class C038_RuntimePolymorphismDemo {
    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        C038_Animal animal;

        System.out.print("Would you like a dog or a cat (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new C038_Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new C038_Cat();
            animal.speak();
        }
    }
}

abstract class C038_Animal{

    abstract void speak();
}

class C038_Dog extends C038_Animal{
    @Override
    void speak(){
        System.out.println("The dog goes woof");
    }
}

class C038_Cat extends C038_Animal{
    @Override
    void speak(){
        System.out.println("The dog goes meow");
    }
}