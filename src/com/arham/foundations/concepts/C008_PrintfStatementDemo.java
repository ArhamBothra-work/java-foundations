package com.arham.foundations.concepts;

public class C008_PrintfStatementDemo {
    public static void main (String[] args){
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 20;
        double height = 172;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n",firstLetter);
        System.out.printf("You are %d years old\n",age);
        System.out.printf("your height is %.1f cm\n",height);
        System.out.printf("Employed: %b\n",isEmployed);

        System.out.printf("%s is %d years old\n",name, age);

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("% .2f\n",price1);
        System.out.printf("% .2f\n",price2);
        System.out.printf("%.2f\n",price3);

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);
    }
}
