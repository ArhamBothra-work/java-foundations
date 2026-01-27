package com.arham.foundations.projects;

import java.util.Scanner;

public class P003_WeightConverter {
    public static void main (String[] args){
        // weight conversion program
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1. Convert lbs to kg");
        System.out.println("2. Convert kg to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if (choice == 1){
            System.out.print("Enter the weight: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        }
        else if (choice == 2){
            System.out.print("Enter the weight: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        }
        else{
            System.out.println("The entered choice is not valid");
        }
        scanner.close();
    }
}
