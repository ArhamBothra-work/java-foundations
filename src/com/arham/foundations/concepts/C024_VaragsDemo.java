package com.arham.foundations.concepts;

public class C024_VaragsDemo {
    public static void main(String[] args) {

        System.out.println(add(1,2,3,4,6,4,5,7,8,9,3));
        System.out.println(average(1,2,3,4,5,6,7,8,9,10));
    }

    static int add(int... numbers){
        int sum = 0;
        for(int num: numbers){
            sum+=num;
        }
        return sum;
    }

    static double average(double... numbers){

        double sum = 0;

        for(double num: numbers){
            sum += num;
        }

        return sum / numbers.length;
    }

}
