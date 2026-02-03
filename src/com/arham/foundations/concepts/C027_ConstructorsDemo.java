package com.arham.foundations.concepts;

public class C027_ConstructorsDemo {
    public static void main(String[] args) {

        C027_ConstructorsDemo_Class student1 = new C027_ConstructorsDemo_Class("Arham",20,4.0);
        C027_ConstructorsDemo_Class student2 = new C027_ConstructorsDemo_Class("Hiro",21,3.8);

        System.out.println();
        System.out.println("Student 1 Details: ");
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println();
        System.out.println("Student 2 Details: ");
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println();
        student1.study();
        student2.study();
    }
}
