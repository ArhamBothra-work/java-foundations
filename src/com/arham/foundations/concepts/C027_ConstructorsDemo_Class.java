package com.arham.foundations.concepts;

import javax.swing.text.html.parser.TagElement;

public class C027_ConstructorsDemo_Class {

    //Student Class

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    C027_ConstructorsDemo_Class(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }
}
