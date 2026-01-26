package com.arham.foundations.projects;
import java.util.Scanner;

public class P001_ShoppingCart {
    public static void main (String[] args){
        //shopping cart program

        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each? ");
        price = scanner.nextDouble();

        System.out.print("How much of it are you buying: ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("You have bought "+ quantity + " " + item + "s ");
        System.out.println("Your total is "+currency+total);

        scanner.close();
    }
}
