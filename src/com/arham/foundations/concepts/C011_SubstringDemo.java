package com.arham.foundations.concepts;
import java.util.Scanner;

public class C011_SubstringDemo {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        String email;


        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            String username = email.substring(0,email.indexOf("@"));
            String domain = email.substring(email.indexOf("@")+1);
            System.out.println("Your username is: "+username);
            System.out.println("Your domain is: "+domain);
        }
        else{
            System.out.println("Emails must contain '@'");
        }

        scanner.close();
    }
}
