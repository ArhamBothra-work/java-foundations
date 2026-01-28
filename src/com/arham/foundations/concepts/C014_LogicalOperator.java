package com.arham.foundations.concepts;

import java.util.Scanner;

public class C014_LogicalOperator {
    public static void main(String[] args) {
        // $$ = AND
        // || = OR
        // ! = NOT

        /*double temp = -10;
        boolean isSunny = false;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is good 😊");
            System.out.println("It is SUNNY outside ☀️");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is good 😊");
            System.out.println("It is CLOUDY outside ☁️");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad 🙁");
        }*/

        Scanner sc = new Scanner(System.in);


        //username must be between 4-12 characters
        //username must not contain spaces or underscores

        String username;
        int usernameLength;
        boolean containSpecialCharacters;

        System.out.print("Enter your new username: ");
        username = sc.nextLine();

        usernameLength = username.length();
        containSpecialCharacters = username.contains(" ") || username.contains("_");

        if(usernameLength >= 4 && usernameLength <= 12 && !containSpecialCharacters){
            System.out.println("You have entered a valid username 😄");
        }
        else{
            System.out.println("NOT a valid username 😠");
        }
        sc.close();
    }
}
