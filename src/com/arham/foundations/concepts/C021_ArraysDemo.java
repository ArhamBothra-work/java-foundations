package com.arham.foundations.concepts;
import java.util.Arrays;

public class C021_ArraysDemo {
    public static void main(String[] args) {



        String[] fruits = {"apple","orange","banana","coconut"};
        System.out.println(fruits[0]);

        fruits[0] = "pineapple";
        System.out.println(fruits[0]);

        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);

        for(int i = 0; i<numOfFruits;i++){
            System.out.print(fruits[i] +  " ");
        }
        System.out.println();

        Arrays.sort(fruits);

        for (String fruit: fruits){
            System.out.print(fruit + " ");
        }
        System.out.println();

        Arrays.fill(fruits, "pineapple");

        for (String fruit: fruits){
            System.out.print(fruit + " ");
        }


    }

}
