package com.arham.foundations.concepts;

public class C023_SearchArrayDemo {
    public static void main(String[] args) {

        int[] numbers = {1,9,2,8,3,5,4};
        int target = 7;
        int count = 0;
        boolean isFound = false;


        for (int num : numbers){
            if (num == target){
                System.out.println("found the target at index "+ count);
                isFound = true;
                break;
            }
            count++;

        }
        if(!isFound){
            System.out.println("The target was not found in the Array");
        }
    }
}
