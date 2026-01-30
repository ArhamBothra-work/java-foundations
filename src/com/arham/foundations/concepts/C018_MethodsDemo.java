package com.arham.foundations.concepts;

public class C018_MethodsDemo {

    static void happyBirthday(String name, int age){
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n",name);
        System.out.printf("You are %d years old!!!\n",age);
        System.out.println("happy birthday to you!\n");
    }

    static double square(double number){
        return number * number;
    }

    static boolean ageCheck(int age){
        if(age>=18){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        //method = a block of code that is executed when called ()

        String name = "Arham";
        int age = 20;

        happyBirthday(name,age);

        double result = square(3);
        System.out.println("The square of the number: "+result);

        if(ageCheck(age)){
            System.out.println("You can sign up");
        }else{
            System.out.println("You must be at least 18 years of age to sign up");
        }

    }
}
