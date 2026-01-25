package com.arham.foundations.concepts;
import java.util.Scanner;

public class C003_UserInputDemo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); //first user input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello "+ name);
        System.out.println("You are "+ age + " Years old.");
        System.out.println("Your gpa is " + gpa);

        if (isStudent){
            System.out.println("You are a student");
        }else{
            System.out.println("You are not a student");
        }

        scanner.nextLine(); //adding an empty nextLine here to remove the /n from the input buffer from the previous inputs

        System.out.print("Enter your fav color: ");
        String color = scanner.nextLine();
        System.out.println("Your fav color is: "+ color);


        //calc the area of rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.println("Enter the width");
        width += scanner.nextDouble();

        System.out.println("Enter your height");
        height += scanner.nextDouble();

        area = width * height;
        System.out.println("Area of your reactangle is " + area);

        scanner.close();

    }
}
