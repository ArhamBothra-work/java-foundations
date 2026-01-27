package com.arham.foundations.concepts;

public class C012_TernaryOperatorDemo {
    public static void main(String[] args) {

        int score = 80;
        String passOrFail = (score >= 60) ? "pass" : "fail";
        System.out.println(passOrFail);

        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        int hours = 13;
        String timeOfDay = (hours < 12) ? "AM" : "PM";
        System.out.println(hours);
    }
}
