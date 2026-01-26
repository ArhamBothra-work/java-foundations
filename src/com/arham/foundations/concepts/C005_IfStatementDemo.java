package com.arham.foundations.concepts;
import java.util.Scanner;

public class C005_IfStatementDemo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("How old are you: ");
        age = scanner.nextInt();

        System.out.print("Are you a student (true/false): ");
        isStudent = scanner.nextBoolean();

        if (name.isEmpty()){
            System.out.println("You haven't entered a name 💀");
        }else{
            System.out.println("hello "+ name);
        }


        if(age>=18 && age < 65){
            System.out.println("You are an adult");
        } else if (age >=65) {
            System.out.println("You are a senior!");
        } else if (age < 0) {
            System.out.println("You haven't been born yet!");
        } else if (age ==0) {
            System.out.println("You are a baby");
        } else{
            System.out.println("You are a child");
        }

        if (isStudent){
            System.out.println("You are a student");
        }else{
            System.out.println("You are not a student");
        }

        scanner.close();
    }
}
