package com.arham.foundations.concepts;

public class C002_VariablesDemo {
    public static void main (String[] args){
        int age; //declaring my first variable
        age = 20; //assigning value to the variable

        int year = 2026;
        System.out.println(age);
        System.out.println("the year is " + year);

        double price = 19.99;
        double gpa = 3.7;
        double temp = -12.5;
        System.out.println("$"+price);

        char grade = 'A';
        char symbol = '%';
        System.out.println("your grade is "+ grade);

        boolean isStudent = true; //camelCase
        boolean forSale = false;

        System.out.println(isStudent);
        System.out.println(forSale);

        if (isStudent){ //sneak peak into if else statements
            System.out.println("you are a student");
        }else {
            System.out.println("not a student");
        }

        String name = "Arham Bothra";
        String email = "myfakeemail@gmail.com";
        System.out.println("My name is "+ name + " ,nice to meet you");
        System.out.println("you can reach out to me at "+ email);
    }
}
