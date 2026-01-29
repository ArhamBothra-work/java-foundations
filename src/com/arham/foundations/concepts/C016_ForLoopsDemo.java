package com.arham.foundations.concepts;

import java.util.Scanner;

public class C016_ForLoopsDemo {
    public static void main(String[] args) throws InterruptedException {

        /*for(int i = 0; i < 10; i++){
            System.out.println("pizza");
        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many times you want to loop: ");

        int max = scanner.nextInt();

        for(int i = 0; i< max;i++){
            System.out.println(i);
        }

        scanner.close();*/

//        int start = 10;
//        for(int i = start; i>0;i--){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("HAPPY NEW YEAR");

        for(int i = 0; i<10;i++){
            if(i==3){
                continue;
            }
            if(i ==5){
                break;
            }
            System.out.print(i + " ");
        }
    }
}
