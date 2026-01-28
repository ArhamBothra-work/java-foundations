package com.arham.foundations.projects;

import java.util.Scanner;

public class P004_TemperatureConversion {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double temp,newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.println("Convert to Celsius or Farenheit (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp-32) * 5/9 : (temp * 5/9) + 32;

        System.out.printf("The new temperature is: %.2f%s",newTemp,unit);

        scanner.close();
    }
}
