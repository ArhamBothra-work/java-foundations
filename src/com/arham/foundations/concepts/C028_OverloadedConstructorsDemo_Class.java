package com.arham.foundations.concepts;

public class C028_OverloadedConstructorsDemo_Class {

    //User Class

    String username;
    String email;
    int age;

    C028_OverloadedConstructorsDemo_Class(){
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    C028_OverloadedConstructorsDemo_Class(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }

    C028_OverloadedConstructorsDemo_Class(String username,String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    C028_OverloadedConstructorsDemo_Class(String username,String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
