package com.arham.foundations.concepts;

public class C030_StaticDemo_Class {

    static int numOfFriends;
    String name;

    C030_StaticDemo_Class(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have "+ numOfFriends + " total friends");
    }


}
