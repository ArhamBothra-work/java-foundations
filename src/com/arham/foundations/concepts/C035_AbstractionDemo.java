package com.arham.foundations.concepts;

import org.w3c.dom.css.Rect;

public class C035_AbstractionDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(6,7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}

abstract class Shape{

    abstract double area(); //abstract method

    void display(){   //concrete method
        System.out.println("This is a shape");
    }
}

 class Circle extends Shape{

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius * radius;
    }
 }

 class Triangle extends Shape{

    double base;
    double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

     @Override
     double area(){
         return 0.5 * base * height;
     }
 }

 class Rectangle extends Shape{

    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

     @Override
     double area(){
         return length*width;
     }
 }