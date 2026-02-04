package com.arham.foundations.concepts;

public class C032_SuperDemo {
    public static void main(String[] args) {
        Person person = new Person("Tom", "Riddle");
        person.showName();

        Student student = new Student("Harry", "Potter",3.25);
        student.showGPA();

        Employee employee = new Employee("Rubeus", "Hagrid", 50000);
        employee.showSalary();
    }
}

class Person{

    String first;
    String last;

    Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    void showName(){
        System.out.println(this.first + " " + this.last);
    }
}

class Student extends Person{

    double gpa;

    Student(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }
}

class Employee extends Person{
    int salary;
    Employee(String first, String last, int salary){
        super(first,last);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.first + "'s salary is $" + this.salary);
    }
}