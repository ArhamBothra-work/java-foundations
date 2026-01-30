package com.arham.foundations.concepts;

public class C019_OverloadedMethodsDemo {

    public static void main(String[] args) {
        System.out.println(add(1,2,3));

        String pizza = bakePizza("flat bread","mozzarella");
        System.out.println(pizza);
    }

    //methods can share same name but must have different parameters (unique signature)


    static double add(double a,double b){
        return a+b;
    }
    static double add(double a,double b,double c){
        return a+b+c;
    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread,String cheese){
        return cheese + " " + bread + " pizza";
    }

}
