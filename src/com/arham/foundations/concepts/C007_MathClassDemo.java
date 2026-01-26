package com.arham.foundations.concepts;
import java.util.Scanner;
public class C007_MathClassDemo {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);


        double result;
        double a;
        double b;
        double hypotenuse;
        double radius;
        double circumference;
        double area;
        double volume;

        result = Math.pow(3,9);
        result = Math.abs(-5);
        result = Math.sqrt(4);
        result = Math.round(3.14);
        result = Math.round(3.14);
        result = Math.ceil(3.1);
        result = Math.ceil(3.1);
        result = Math.floor(3.99999);
        result = Math.floor(3.99999);
        result = Math.max(1,45);

//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//        System.out.println(result);

        //hypotenuse
        System.out.print("Enter side a: ");
        a = scanner.nextDouble();
        System.out.print("Enter side b: ");
        b = scanner.nextDouble();

        hypotenuse = Math.sqrt((Math.pow(a,2)) + (Math.pow(b,2)));
        System.out.println("The hypotenuse of this triangle is: "+hypotenuse + "cm");

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius,2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

        System.out.printf("The circumference is %.1fcm\n", circumference);
        System.out.printf("The area is %.1fcm\n", area);
        System.out.printf("The volume is %.1f\n",volume);

        scanner.close();

    }
}
