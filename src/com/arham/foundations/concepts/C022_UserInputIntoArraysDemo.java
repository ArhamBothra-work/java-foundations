package com.arham.foundations.concepts;

import java.util.Scanner;

public class C022_UserInputIntoArraysDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] foods;

        System.out.print("What # of food do you want?: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];


        for (int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods){
            System.out.print(food + " ");
        }

        scanner.close();
    }
}
